package com.example.demo.Controller;

import com.example.demo.entiry.Point;
import com.example.demo.entiry.contorller;
import com.example.demo.entiry.park;
import com.example.demo.service.ParkServicelmpl;
import com.example.demo.service.controllerServicempl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * TODO:这里仅有两个网页的url链接
 * */
@Controller
public class testController {

    String listStr = "";



    //这里是park部分的事物
    @Autowired
    public ParkServicelmpl parkServicelmpl;
    //这里是管理员登录注册业务
    @Autowired
    public controllerServicempl Conservmpl;
    /**
     * @param /test是park部分做的表信息网页
     * @return 返回主要的页面
     * */
    @RequestMapping("/test")
    public String index(){
        return  "/table.html";
    }


    /**
     * TODO:将所有数据以json格式发到tablr.html的页面上
     * @return 以json格式的park表中的所有数据
     * */
    @RequestMapping(value = "/reg")
    @ResponseBody
    public String test2(){
        //gson是可以将类转换成json格式
        Gson gson = new Gson();
        //层事物拿到数据集
        ArrayList<park> arr = parkServicelmpl.AllTableDate();




        //转换成json
        String str ="{\"code\":0,\"msg\":\"\",\"count\":1,\"data\":"+gson.toJson(arr)+"}";
        return str;
    }

    /**
     * TODO:通过选取表上的某一行数据进行删除
     * @param data 网页上某一行的json格式
     * */
    @RequestMapping(value = "/del")
    @ResponseBody
    public String test3(String data){
        //gson是可以将类转换成json格式
        Gson gson = new Gson();
        String str = "";
        //转换json
        park p = gson.fromJson(data,park.class);
        //查找到相应的数据并删除
        str += parkServicelmpl.DeleteParkByObj(p);
        return str;
    }

    /**
     * TODO:URL展示login_page.html
     * */
    @RequestMapping("/logins")
    public String logins(){ return "/Login_page.html";}



    /**
     * TODO:具体登录业务
     * @param name：是账号
     * @param password:是密码
     * @return 验证登录是否成功
     * */
    @RequestMapping(value = "/lon")
    @ResponseBody
    public String login(String name,String password){
//        System.out.println(name+"       "+password);
        //调用登录业务
        contorller c = Conservmpl.LoginByNaPass(name,password);
        //如果是Y就说明验证成功,如果是N就是没有登陆成功（这里可以更加细化）
       if( c.getCtr_id() != null){
           return "Y";
       }
        return "N";
    }


    /**
     * TODO：增加一个park
     * @param data 传过来的JSON类
     * @return 返回是否成功的值
     * */

    @RequestMapping(value = "/add")
    @ResponseBody
    public String insert(String data) {
        System.out.println(data);
        Gson gson = new Gson();
        park Part = gson.fromJson(data,park.class);
        int i = parkServicelmpl.InsertPark(Part);
        if(i >= 0){
            return "Y";
        }else return "N";

    }


    /**
     * TODO：做编辑信息功能
     *
     *
     * */
    @RequestMapping(value = "/update")
    @ResponseBody
    public String update(String olddata,String newdata){
        Gson gson = new Gson();
        System.out.println(olddata);
        System.out.println(newdata);
        park old = gson.fromJson(olddata,park.class);
        park new_ = gson.fromJson(newdata,park.class);
        int i = parkServicelmpl.upDate(old,new_);
        if(i >= 0){
        return "Y";
        }else {
            return "N";
        }

    }

    @RequestMapping(value = "/msg")
    @ResponseBody
    public String msg(String data){
        listStr = data;
        System.out.println(listStr);
        return "Y";
    }


    @RequestMapping(value = "/unmsg")
    @ResponseBody
    public String unmsg(){
        return listStr;
    }


    @RequestMapping(value = "/listDel")
    @ResponseBody
    public String ListDel(String data){

       int i = parkServicelmpl.ListDataDel(data);
        if(i >= 0){
        return "Y";}
        else return "N";
    }
    @RequestMapping("/cap")
    public String cap(){
        return  "/cap.html";
    }

    @RequestMapping(value = "/point")
    @ResponseBody
    public String pointAll(){
        ArrayList<Point>  p =  parkServicelmpl.all_Point();
        String res = "";
        for(int i = 0;i < p.size();i++){
            res+=p.get(i).getLatitude();
            res+=",";
            res+=p.get(i).getLongitude();
            res+=";";
        }
        return res;

    }











}
