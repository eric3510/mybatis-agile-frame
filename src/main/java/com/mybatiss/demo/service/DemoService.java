package com.mybatiss.demo.service;

import com.mybatiss.demo.pojo.model.DemoDO;

import java.util.List;

/***
 * @author Eric Email :
 * @version 创建时间：2018/10/16
 * DemoService
 */
public interface DemoService{
    /***
     * 获取所有
     * @return DemoDO
     */
    List<DemoDO> allDemo();
}
