package com.powernode.service;

import com.powernode.entity.Standard;

import java.util.List;


public interface StandardService {
    /*获取全部数据*/
    List<Standard> getAll();

    /*根据id获取单个数据*/
    Standard getOneById(Integer id);

    /*模糊查询获取单个数据*/
    List<Standard> conGet(String zhname);

    /*根据id删除数据*/
    int deleteAll(Integer ...ids);

    /*根据id更新数据*/
    int updateById(Standard standard);

    /*插入新数据*/
    int addOne(Standard standard);
}
