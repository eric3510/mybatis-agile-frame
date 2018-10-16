package com.mybatiss.demo.dao;

import com.mybatiss.demo.pojo.model.DemoDO;

import java.util.List;

/***
 * @author Eric Email :
 * @version 创建时间：2018/10/16
 * DemoMapper
 */
public interface DemoMapper{
    List<DemoDO> selectAll();
}
