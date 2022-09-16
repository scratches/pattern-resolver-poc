package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class Main {
	public static void main(String[] args) throws Exception {
		System.err.println(Arrays.asList(new PathMatchingResourcePatternResolver().getResources("classpath*:/folder/*")));
		SpringApplication.run(Main.class, args);
	}
}
