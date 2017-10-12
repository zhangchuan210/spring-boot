package cn.cdboost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zc
 * @desc
 * @create 2017-10-12 13:39
 **/
@Service
public class RedisService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;


    /**
     * 根据指定key获取String
     * @param key
     * @return
     */
    public String getStr(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * 设置Str缓存
     * @param key
     * @param val
     */
    public void setStr(String key, String val){
        stringRedisTemplate.opsForValue().set(key,val);
    }

    /**
     * 检查key是否存在
     * @param key
     */
    public boolean checkExists(String key){
        return stringRedisTemplate.hasKey(key);
    }


    /**
     * 删除指定key
     * @param key
     */
    public void del(String key){
        stringRedisTemplate.delete(key);
    }

    /**
     * 根据指定o获取Object
     * @param o
     * @return
     */
    public Object getObj(Object o){
        return redisTemplate.opsForValue().get(o);
    }

    /**
     * 设置obj缓存
     * @param o1
     * @param o2
     */
    public void setObj(Object o1, Object o2){
        redisTemplate.opsForValue().set(o1, o2);
    }

    /**
     * 删除Obj缓存
     * @param o
     */
    public void delObj(Object o){
        redisTemplate.delete(o);
    }

    /**
     * 检查key是否存在
     * @param key
     */
    public boolean checkExists(Object key){
        return redisTemplate.hasKey(key);
    }
}
