package com.guocai.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
@EnableDubbo // 开启基于注解的dubbo功能
@SpringBootApplication
public class BootOrderServiceConsumerApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		SpringApplication.run(BootOrderServiceConsumerApplication.class, args);		
	}
}
