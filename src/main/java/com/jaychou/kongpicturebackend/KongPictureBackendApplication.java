package com.jaychou.kongpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@MapperScan("com.jaychou.kongpicturebackend.mapper")
@SpringBootApplication
@EnableAsync
@EnableAspectJAutoProxy(exposeProxy = true)
public class KongPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KongPictureBackendApplication.class, args);
    }

}
