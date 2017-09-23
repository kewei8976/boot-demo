package com.nashwork.api.impl;


import com.nashwork.api.User;
import com.nashwork.dal.entity.SysUserEntity;
import com.nashwork.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:53 星期六
 * @Version : v1.0
 **/
@Slf4j
@RestController
public class UserImpl implements User {

    @Autowired
    UserService userService ;

    @Override
    @ApiOperation(value = "返回用户信息", httpMethod = "GET", notes = "返回用户信息")
    @RequestMapping("/user")
    public SysUserEntity findUserById(String id) {
        return userService.findUserById(id);
    }
}
