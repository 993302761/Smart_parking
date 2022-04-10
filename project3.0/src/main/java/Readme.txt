MYSQL
{

        User_information        //用户表
        {
        user_name：用户名
        password：密码
        user_id：身份证号
        }


        Vehicle_information     //车辆信息表
        {
        user_name：用户名
        user_id：身份证号
        license_plate_number：车牌号
        picture_index：车辆照片
        registration：机动车登记证
        vehicle_license：车辆行驶证
        }


        Payment                 //订单信息表
        {
        user_name：用户名
        intime：进入时间
        outtime：离开时间
        Parking_name：停车场名
        place_id：车位编号
        car_id：车牌号
        money：支付金额
        pay_suc：是否支付
        }


        Parking_lot_information            //停车场信息
        {
        pctr_id：停车场管理员账号
        pctr_password：停车场管理员密码
        Parking_name：停车场名
        place_id：停车场编号
        place_num：车位数量
        Billing method：计费方式
        billing_rules：计费规则
        longitude：经度
        latitude：纬度
        }


        controller                  //超级管理员
        {
        ctr_id：管理员账号
        ctr_password：管理员密码
        }

}


Redis
{

        Parking_space           //可用车位情况
        {
        place_id：停车场编号
        place_num：车位数量
        Available_place_num：可用车位数量
        }


        record                  //访问记录
        {
        time：时间
        user_name:用户名
        Interface_name：请求接口
        Access_results：访问结果
        }


}


ES{

        Parking_lot_information         //停车场信息
        {
        Parking_name：停车场名
        place_id：停车场编号
        longitude：经度
        latitude：纬度
        }

}



Gradle-version:7.2
Redis-version:6.2.5