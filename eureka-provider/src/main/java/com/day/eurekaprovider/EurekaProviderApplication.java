package com.day.eurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.day.eurekaprovider.*.mapper")
@EnableTransactionManagement
public class EurekaProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}
}
