package com.nashwork.service.impl;

import com.nashwork.dal.entity.SysUserEntity;
import com.nashwork.service.UserService;
import com.nashwork.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:55 星期六
 * @Version : v1.0
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository ;

    @Override
    public SysUserEntity findUserById(String id) {
        return userRepository.getUserById(id);
    }
}
