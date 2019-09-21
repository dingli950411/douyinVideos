package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.imooc"})
//@ComponentScan(basePackages= {"com.imooc"})
public class Videosapplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Videosapplication.class, args);
	}
	
}
