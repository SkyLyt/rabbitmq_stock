package com.lyt.rabbitmq_stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lyt.rabbitmq_stock.mapper")
@SpringBootApplication
public class RabbitmqStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqStockApplication.class, args);
	}

}
