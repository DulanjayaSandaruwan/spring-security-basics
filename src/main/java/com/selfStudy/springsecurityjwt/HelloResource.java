package com.selfStudy.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 15/10/2022
 **/

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public String hello() {
        return "Hello world";
    }

}
