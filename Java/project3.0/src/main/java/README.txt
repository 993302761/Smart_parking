MYSQL

create database Smart_parking;           //数据库名

{

        User_information        //用户表
        {
        user_name：用户名
        password：密码
        user_id：身份证号
        }

create table User(user_name varchar(11) primary key,
                  password varchar(50) not null,
                  user_id varchar(20) not null);

        Vehicle_information     //车辆信息表
        {
        user_name：用户名
        user_id：身份证号
        license_plate_number：车牌号
        picture_index：车辆照片
        registration：机动车登记证照片
        vehicle_license：车辆行驶证照片
        }

create table Vehicle_information(user_name varchar(11) primary key,
                                 user_id varchar(20) not null,
                                 license_plate_number varchar(20),
                                 picture_index varchar(50),
                                 registration varchar(50),
                                 vehicle_license varchar(50));

        Order_information                  //订单信息表
        {
         order_number:订单编号
         generation_time：订单生成时间
        user_name：用户名
        inTime：进入时间
        outTime：离开时间
        parking_lot_name：停车场名
        parking_lot_number ：停车场编号
        license_plate_number ：车牌号
        payment_amount ：支付金额
        whether_to_pay ：是否支付
         order_status :订单状态
        }

create table Order_information( order_number varchar(50)  primary key,
                                 generation_time datetime not null,
                                 user_name varchar(11) not null,
                                 inTime datetime,
                                 outTime datetime,
                                 parking_lot_name varchar(50),
                                 parking_lot_number varchar(20) not null,
                                 license_plate_number varchar(20) not null,
                                 payment_amount float,
                                 whether_to_pay boolean not null,
                                 order_status varchar(20) not null);


        Parking_lot_information            //停车场信息
        {
        pctr_id：停车场管理员账号
        pctr_password：停车场管理员密码
        parking_lot_name：停车场名
        parking_lot_number：停车场编号
        parking_spaces_num：车位数量
        billing_rules：计费规则  (元/小时)
        longitude：经度
        latitude：纬度
        }


create table Parking_lot_information(pctr_id varchar(11) primary key,
                                     pctr_password varchar(50) not null,
                                     parking_lot_name varchar(50) not null,
                                     parking_lot_number varchar(20) not null,
                                     parking_spaces_num int not null,
                                     billing_rules float,
                                     longitude varchar(20) not null,
                                     latitude varchar(20)  not null);


        controller                  //超级管理员
        {
        ctr_id：管理员账号
        ctr_password：管理员密码
        }


create table controller(ctr_id varchar(11) primary key,
                        ctr_password varchar(50) not null);

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


         Recent_login_user      //最近登录的用户
         {
         UUID：通用唯一识别码
         user_name：用户名
         heartTime：心跳时间
         }

}






Gradle-version:6.9.2
Redis-version:6.2.5