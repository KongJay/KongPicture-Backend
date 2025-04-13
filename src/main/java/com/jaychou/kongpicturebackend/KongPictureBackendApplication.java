package com.jaychou.kongpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.jaychou.kongpicturebackend.mapper")
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class KongPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KongPictureBackendApplication.class, args);
    }

}
