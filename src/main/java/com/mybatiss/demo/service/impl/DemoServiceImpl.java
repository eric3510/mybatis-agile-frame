package com.mybatiss.demo.service.impl;

import com.mybatiss.demo.dao.DemoMapper;
import com.mybatiss.demo.pojo.model.DemoDO;
import com.mybatiss.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @author Eric Email :
 * @version 创建时间：2018/10/16
 * DemoServiceImpl
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoDO> allDemo(){
        return demoMapper.selectAll();
    }
}
