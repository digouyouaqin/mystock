package com.wq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wq.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowired
    private TestMapper testMapper;

    //@Transactional
    public List<Map<String, Object>> getlist() {
        return testMapper.getlist();
    }
}
