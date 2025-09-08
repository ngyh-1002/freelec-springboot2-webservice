package com.jojoldu.book.springboot;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJpaAuditing  // JPA Auditing 활성화
// 스프링 부트의 자동 설정, 스프링 brean 읽기와 생성을 모두 자동 생성
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}