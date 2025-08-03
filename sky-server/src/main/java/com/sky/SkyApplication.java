package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
    /**
     * 程序的入口点
     * 使用Spring Boot框架启动应用程序
     * @param args 命令行参数，用于在启动时传递给应用程序
     */
    public static void main(String[] args) {
        // 启动SkyApplication应用程序
        SpringApplication.run(SkyApplication.class, args);
        // 记录服务器启动信息
        log.info("server started");
    }
}
