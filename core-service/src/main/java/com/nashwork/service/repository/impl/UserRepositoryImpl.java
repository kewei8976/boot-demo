package com.nashwork.service.repository.impl;


import com.nashwork.dal.dao.SysUserDao;
import com.nashwork.dal.entity.SysUserEntity;
import com.nashwork.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:57 星期六
 * @Version : v1.0
 **/
@Slf4j
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Resource
    SysUserDao sysUserDao ;

    @Override
    public SysUserEntity getUserById(String id) {
        return sysUserDao.selectByPrimaryKey(id);
    }
}
