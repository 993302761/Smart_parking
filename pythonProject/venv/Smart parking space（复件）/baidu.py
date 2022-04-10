import json
# 导入请求包
import os
import time

import cv2
import requests
# 自己的 APPID AK SK
from aip import AipOcr

APP_ID = '23578338'
API_KEY = '2eAMHSdgUHpqcOvj11xLeKjD'
SECRET_KEY = 'Q2h5kFFTb5GK1pd09mt4fMisnc1u1jG0'
client = AipOcr(APP_ID, API_KEY, SECRET_KEY)


def get_file_content(filePath):
    with open(filePath, 'rb') as fp:
        return fp.read()


def baidu_api(img):
    client.setConnectionTimeoutInMillis(5000)
    # 通过打开的连接传输数据的超时时间，单位为毫秒
    client.setSocketTimeoutInMillis(5000)
    try:
        image = get_file_content(img)
        res = client.licensePlate(image)
        s = res['words_result']['number']
        b = res['words_result']['color']
    except Exception as e:
        return None, None, 0
    return s, b, 1


def Action(Basepath, frame):
    now = time.localtime()
    nowt = time.strftime("%Y_%m_%d_%H_%M_%S", now)
    img = os.path.join(Basepath) + '/' + "t" + nowt + '.jpg'
    cv2.imwrite(img, frame)
    # s0, roi0, color0, p0 = c.predict(img)
    s0, color0, p0 = baidu_api(img)  # 使用百度API
    if p0 == 0:
        os.remove(img)
        return False
    else:
        s0 = "".join(s0)
        print(s0, color0, nowt)
        # 定一个字典类型
        mapA = {"License_plate": s0, "color": color0, "time": nowt}
        # 把字典转成字符串
        str0 = json.dumps(mapA)
        # 这里得给设置一个请求格式，不然会返回415
        # header_dict = {'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; rv:11.0) like Gecko',"Content-Type": "application/json"}
        header_dict = {"Content-Type": "application/json; charset=utf8"}
        # 直接请求
        r = requests.post(url, data=str0, headers=header_dict)
        # 这里是输出了一个字符串
        print(r.text)
        return True


def show():
    cap = cv2.VideoCapture(0)
    # 设置摄像头分辨率高度
    cap.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
    # 设置摄像头分辨率宽度
    cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)
    cap.set(cv2.CAP_PROP_FOURCC, cv2.VideoWriter_fourcc('M', 'J', 'P', 'G'))
    Basepath = os.path.dirname(os.path.abspath("/home/lyq/project/pic/*"))
    # i = 60
    while cap.isOpened():
        ret, frame = cap.read()
        # print(i)
        cv2.imshow("cap", frame)
        if cv2.waitKey(100) & 0xff == ord('q'):
            break
        if Action(Basepath, frame):
            time.sleep(300)

    cap.release()
    cv2.destroyAllWindows()


if __name__ == '__main__':
    # 设置要访问的地址
    url = 'http://172.16.176.1:8080/pythonToJavaTest'
    show()
