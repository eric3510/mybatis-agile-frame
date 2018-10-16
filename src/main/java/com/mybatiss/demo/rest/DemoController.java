package com.mybatiss.demo.rest;

import com.mybatiss.base.mysql.service.DaoMysqlService;
import com.mybatiss.demo.pojo.model.DemoDO;
import com.mybatiss.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * @author Eric Email :
 * @version 创建时间：2018/10/16
 * DemoController
 */
@RestController
@RequestMapping("/demo")
public class DemoController{
    @Autowired
    private DemoService demoService;

    @Autowired
    private DaoMysqlService daoMysqlService;

    @GetMapping("/all-demo-do")
    public List<DemoDO> allDemoDO(){
        return demoService.allDemo();
    }

    @GetMapping("/frame-test")
    public List<DemoDO> frameTest(){
        return daoMysqlService.list(DemoDO.class, "SELECT * FROM demo", new HashMap<>());
    }
}
