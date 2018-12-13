package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@SpringBootApplication
@EnableApolloConfig  //读取阿波罗配置信息
public class SpringcloudApolloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApolloApplication.class, args);
	}

}

