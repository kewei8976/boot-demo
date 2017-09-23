package com.nashwork.dal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class SysUserEntity {
    private String oaId;

    private String companyName;

    private String departmentAllpath;

    private String userNo;

    private String loginName;

    private String loginPwd;

    private String userName;

    private String job;

    private String cellphone;

    private String tel;

    private String email;

    private String nashName;

    private Object departmentLtree;

    private String creator;

    private Date createAt;

    private String modifier;

    private Date modifyAt;

    private Integer status;


}