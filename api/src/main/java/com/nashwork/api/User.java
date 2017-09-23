package com.nashwork.api;


import com.nashwork.dal.entity.SysUserEntity;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:53 星期六
 * @Version : v1.0
 **/
public interface User {
    SysUserEntity findUserById(String id) ;
}
