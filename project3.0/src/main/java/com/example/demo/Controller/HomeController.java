package com.example.demo.Controller;


import com.example.demo.dao.parkDao;
import com.example.demo.entiry.parking;
import com.example.demo.entiry.record;
import com.example.demo.service.RedisServicempl;
import com.google.gson.Gson;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    @Autowired
    private parkDao parkDao;
    @Autowired
    private RedisServicempl redisServicempl;

    @ResponseBody
    @RequestMapping(value = "/pythonToJavaTest",method = RequestMethod.POST)
    public AjaxResult pythonToJavaTest(@RequestBody JSONObject jsonParam) {
        Gson gson = new Gson();
        record record = gson.fromJson(jsonParam.toString(),record.class);
        ArrayList<parking> ar = parkDao.get_Parking();
        for(int i = 0;i < ar.size();i++){
//            System.out.println(ar.get(i).getPark_id());
            String key = ar.get(i).getPark_id();
            if(key.equals(record.getId())) {
                ar.get(i).setIsusig(record.getIsusing());
            }
        }

        String value = gson.toJson(ar);
        redisServicempl.setValue("parking",value);

        String val = redisServicempl.getValue("parking");
        System.out.println("python:"+val);

        if(record.getLicense_plate()==null)
            return null;
        System.out.println("---jsonParam:"+jsonParam.toString());
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("info","Java客户端接收到了消息！");
        AjaxResult ajax = AjaxResult.success();
        ajax.put("success", jsonObject);
        return ajax;
    }

}
