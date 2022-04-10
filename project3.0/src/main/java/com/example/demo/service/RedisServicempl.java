package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisServicempl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void setValue(String key, Map<String, Object> value) {

        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key,value);

    }

    @Override
    public void setValue(String key, String value) {

        ValueOperations<String,String> vo = redisTemplate.opsForValue();
        vo.set(key,value);

    }

    @Override
    public void setValue(String key, Object value) {
        ValueOperations<String,Object> ov = redisTemplate.opsForValue();
        ov.set(key,value);
    }

    @Override
    public Object getMapValue(String key) {
        ValueOperations<String, String> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    @Override
    public String getValue(String key) {
        ValueOperations<String,String> ov = redisTemplate.opsForValue();
        return ov.get(key);
    }

    @Override
    public void del_Key(String key) {
        ValueOperations<String,String> ov = redisTemplate.opsForValue();
        ov.set(key,null);
    }
}
