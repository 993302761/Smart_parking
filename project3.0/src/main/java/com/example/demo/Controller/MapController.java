package com.example.demo.Controller;

import com.example.demo.entiry.Point;
import com.example.demo.entiry.parking;
import com.example.demo.service.ParkServicelmpl;
import com.example.demo.service.RedisServicempl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/Map")
public class MapController {
    @Autowired
    private ParkServicelmpl parkServicelmpl;



    @RequestMapping(value = "/point",method = RequestMethod.POST)
    public ArrayList<parking> getpoint()
    {
        ArrayList<parking> list=parkServicelmpl.All_Parking();
//        for(int i = 0 ; i<list.size();i++){
//            parking s=list.get(i);
//            System.out.print("APP:"+s.getPark_id());
//            System.out.println("  "+s.getIsusig());
//        }
        return list;
    }
}
