package com.uhasoft.dac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Weihua
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.uhasoft.dac.dao")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
