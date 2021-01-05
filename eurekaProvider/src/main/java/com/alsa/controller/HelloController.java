package com.alsa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2021/1/5
 * @Time: 19:00
 * @Description:
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> instanceInfos = client.getInstances("hello-service");
        instanceInfos.stream().forEach(instanceInfo -> {
            logger.info("/hello,host:"+instanceInfo.getHost()+",service_id:"+instanceInfo.getInstanceId());
        });
        return "hello world";
    }
}
