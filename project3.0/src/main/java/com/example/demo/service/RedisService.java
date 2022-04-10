package com.example.demo.service;

import java.util.Map;

public interface RedisService
{
    void setValue(String key, Map<String, Object> value);
    //存值
    void setValue(String key, String value);
    void setValue(String key, Object value);
    //获取值
    Object getMapValue(String key);

    String getValue(String key);
    void del_Key(String key);



}
