package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping
public class ConsumerController {
    //自动装载，可以直接用
    @Autowired
    private DiscoveryClient discoveryClient;
    //不会自动装在
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/instances")
    public List<ServiceInstance> instances(){
        return this.discoveryClient.getInstances("provider");

    }
//    @GetMapping("/index")
//    public String index(){
//        //调用provider服务的方法
//        //1、找到provider实例
//        List<ServiceInstance> providers= discoveryClient.getInstances("provider");
//        ServiceInstance provider = providers.get(0);
//        String url = provider.getUri()+"/index";
//        //2.调用
//        return restTemplate.getForObject(url,String.class);
//    }
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/index",String.class);
    }
}
