package com.nashwork.service.repository;


import com.nashwork.dal.entity.SysUserEntity;
import org.springframework.data.repository.query.Param;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:57 星期六
 * @Version : v1.0
 **/
public interface UserRepository {
    SysUserEntity getUserById(@Param("id") String id) ;
}
