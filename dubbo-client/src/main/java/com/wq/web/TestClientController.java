package com.wq.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wq.service.ServiceInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestClientController {

    @Reference(version = "1.0.0")
    private ServiceInterface serviceInterface;

    @RequestMapping("/query/{id}/test")
    public List<Map<String,Object>> queryList(@PathVariable String id){

        System.out.println("============================="+id);
        List<Map<String,Object>> list=serviceInterface.getlist();

        return list;
    }



}
