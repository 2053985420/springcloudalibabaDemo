package com.example.provider;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.concurrent.Executor;

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) throws NacosException, InterruptedException {
//        String dataId = "nacos-simple-demo.yaml";
//        String group = "DEFAULT_GROUP";
//        String namespace="73e947d0-2543-4ccf-b1c2-847e1453a51e";
//        String serverAddr = "8.130.11.172:28848";
//        //获取配置
//        Properties properties = new Properties();
//        properties.put("serverAddr",serverAddr);
//        properties.put("namespace",namespace);
//        ConfigService configService = NacosFactory.createConfigService(properties);
//        String config = configService.getConfig(dataId,group,5000);
//        System.out.println(config);
//        configService.addListener(dataId, group, new Listener() {
//            @Override
//            public Executor getExecutor() {
//                return null;
//            }
//            //当配置有变化的时候，或取通知
//            @Override
//            public void receiveConfigInfo(String s) {
//                System.out.println(s);
//            }
//        });
//        while (true){
//            Thread.sleep(2000);
//        }
        SpringApplication.run(ProviderApplication.class, args);
    }

}
