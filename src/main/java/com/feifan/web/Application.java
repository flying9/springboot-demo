package com.feifan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * </p>
 * ClassName: Application
 * Date: 2018/11/15 下午5:29 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@SpringBootApplication
@ComponentScan({"com.feifan.web"})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
