package com.test.demo.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统状态检查
 *
 * @author Jann Lee
 * @date 2019-08-25 17:47
 **/
@RestController
@RequestMapping("/system/status")
public class SystemCheck {

    @GetMapping
    public String check(){
        return "system is ok";
    }

}
