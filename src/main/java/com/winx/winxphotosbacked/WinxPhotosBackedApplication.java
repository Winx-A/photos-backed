package com.winx.winxphotosbacked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan("com.winx.winxphotosbacked.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class WinxPhotosBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WinxPhotosBackedApplication.class, args);
    }

}
