package com.nashwork.dal;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 上午11:58 星期六
 * @Version : v1.0
 **/
public interface BaseDao<T> {
    int deleteByPrimaryKey(String oaId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String oaId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
