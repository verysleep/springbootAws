package com.jojoldu.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 자동 설정 DI >> spring boot 설정 및 spring bean 읽기 / 생성
// 어노테이션은 시작 위치서부터 설정을 읽어 들어감
// @SpringBootApplication 로 인해 내장 was 가 실행됨
// >> 톰캣을 설치할 필요가 없어짐 &
// spring boot 로 만들어진 jar 파일을 실행하면 됨
// 내장 was 란, 별도로 외부에 was 두지 않고 애플리케이션을 실행할 때 내부에서 was 를 실행하는 것
@SpringBootApplication
// main class
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
