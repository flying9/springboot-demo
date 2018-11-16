package com.feifan.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 * ClassName: HelloWorldCtrl
 * Date: 2018/11/16 下午2:41 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldCtrl {

    @RequestMapping("/say")
    public String say(){
        return "hi";
    }
}
