package com.example.demo;

import com.example.demo.entiry.Point;
import com.example.demo.entiry.contorller;
import com.example.demo.entiry.park;
import com.example.demo.entiry.parking;
import com.example.demo.service.RedisServicempl;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private com.example.demo.dao.parkDao parkDao;
    @Autowired
    private com.example.demo.dao.contotllerDao contotllerDao;
    @Autowired
    private RedisServicempl redisServicempl;
    @Test
    void contextLoads() {
        park Part = new park("004","this is park3","b",20.5,1,1);
        int i = parkDao.Add(Part);
        if(i >= 0){
            System.out.println("已增加一条信息"+i);
        }
    }

    @Test
    void test2(){
        String parkid = "002";
        int i = parkDao.Del(parkid);
        if(i < 0){
            System.out.println("未找到该地区");
        }else{
            System.out.println("执行成功"+i);
        }

    }

    @Test
    void test3(){
        Gson gson = new Gson();
        ArrayList<park> arr = parkDao.AllTable();
        for(int i = 0;i < arr.size();i++){
            System.out.println("That is a park_id:"+arr.get(i).getPark_id());
        }
        String gsons = gson.toJson(arr);
        System.out.println(gsons);

    }
    @Test
    void test4(){
        park park = new park("003","this is park3","b",20.5,1,1);

        parkDao.DelByObj(park);
    }

    @Test
    void test5(){
        contorller c = contotllerDao.FindByName_Pass("13978545684","123456");

        if(c.getCtr_id() != null){
            System.out.println("已找到账号:"+c.getCtr_id());
        }

    }

    @Test
    void test6(){
        contorller d = new contorller();
        d.setCtr_id("13978545684");
        d.setCtr_password("123456");
        contotllerDao.Add(d);
    }


    @Test
    void test7(){
        ArrayList<Point> set = parkDao.PointSelect();
        for(int i = 0 ;i < set.size();i++) {
            System.out.println(set.get(i).getLatitude() + "      " + set.get(i).getLongitude());
        }
    }

    @Test
    void test8(){
        park p =new park("002","this is park2","b",20.5,156.45,1455.45);
        Gson gson = new Gson();
        System.out.println(gson.toJson(p));


    }

    @Test
    void test9(){

            park Part = new park("004","this is park3","b",20.5,1,1);

            park Part2 = new park("005","this is","b",20.5,1,1);

            parkDao.UpdateMsg(Part,Part2);

    }



    @Test
    void test10(){
        Gson gson = new Gson();
        ArrayList<parking> ar = parkDao.get_Parking();
        for(int i = 0;i < ar.size();i++){
            System.out.println(ar.get(i).getPark_id());
            String key = ar.get(i).getPark_id();
            String value = gson.toJson(ar.get(i));
            redisServicempl.setValue(key,value);

        }

        for(int i = 0;i < ar.size();i++)
            System.out.println(redisServicempl.getValue(ar.get(i).getPark_id()));

    }


    @Test
    void  test11(){
        redisServicempl.setValue("aaa","123");

    }

    @Test
    void test12(){
        Gson gson = new Gson();
        ArrayList<parking> arrayList = parkDao.get_Parking();
        String val = gson.toJson(arrayList);
        redisServicempl.setValue("1",val);
        ArrayList<parking> arr = gson.fromJson(val,new TypeToken<ArrayList<parking>>(){}.getType());
        System.out.println(arr.get(0).getPark_id());

    }




}
