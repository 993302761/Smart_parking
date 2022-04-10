package com.example.demo.service;

import com.example.demo.entiry.Point;
import com.example.demo.entiry.park;
import com.example.demo.entiry.parking;

import java.util.ArrayList;

//dao层接口
public interface parkService {
    public int Add(park Part);

    public int Del(String parkid);

    public int DelByObj(park Part);

    public ArrayList<park> AllTable();

    public ArrayList<Point> PointSelect();

    public ArrayList<parking> get_Parking();

    public int UpdateMsg(park oldPart,park newPart2);



}
