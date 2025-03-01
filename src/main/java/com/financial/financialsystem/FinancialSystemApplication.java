package com.financial.financialsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.financial.financialsystem.dao")
public class FinancialSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run (FinancialSystemApplication.class, args);
    }

}
