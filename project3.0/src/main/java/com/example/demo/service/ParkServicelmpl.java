package com.example.demo.service;

import com.example.demo.dao.parkDao;
import com.example.demo.entiry.Point;
import com.example.demo.entiry.park;
import com.example.demo.entiry.parking;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * TODO:这里的是业务层，由于目前业务单一所以只是调用dao层而已
 * */
@Service
public class ParkServicelmpl {
    @Autowired
    private parkDao parkDao;
    @Autowired
    private RedisServicempl redisServicempl;
    //添加park
    public int InsertPark(park Part){

        redisServicempl.del_Key("parking");

        return parkDao.Add(Part);
    }
    //删除aprk
    public int DeletePark(String park_id){

        redisServicempl.del_Key("parking");
        return parkDao.Del(park_id);

    }
    //返回结果集park
    public ArrayList<park> AllTableDate(){return parkDao.AllTable();}
    //通过类删除表中的park
    public int DeleteParkByObj(park Part){

        redisServicempl.del_Key("parking");
        return parkDao.DelByObj(Part);

    }

    public int upDate(park old,park new_){

        redisServicempl.del_Key("parking");
        return parkDao.UpdateMsg(old,new_);

    }

    public int ListDataDel(String data){

        redisServicempl.del_Key("parking");
        Gson gson = new Gson();
        ArrayList<park> arr = gson.fromJson(data, new TypeToken<ArrayList<park>>(){}.getType());
        int num = 1;

        for(int i = 0;i < arr.size();i++){
           num = parkDao.DelByObj(arr.get(i));
        }

        return num;

    }

    public ArrayList<Point> all_Point(){
        return parkDao.PointSelect();

    }
    public ArrayList<parking> Get_ParkBuf(){
        return parkDao.get_Parking();
    }


    //TODO:先去redis里面找数据 如果redis里面没有值就去数据库里面找
    public ArrayList<parking> All_Parking(){
        String val = redisServicempl.getValue("parking");
        ArrayList<parking> arr;
        Gson gson = new Gson();
        System.out.println(val);
        if(val == null){
             arr = parkDao.get_Parking();
             String value = gson.toJson(arr);
             redisServicempl.setValue("parking",value);
             return arr;

        }else {
             arr = gson.fromJson(val,new TypeToken<ArrayList<parking>>(){}.getType());
            return arr;
        }
    }


}
