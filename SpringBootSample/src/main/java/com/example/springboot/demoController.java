package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class demoController {
    /* logger */
    private static final Logger Logger = LoggerFactory.getLogger(demoController.class);

    /**
     * test
     * @return test
     */
    @RequestMapping("/test")
    public String index(){
        return "test";
    }

    /**
     * medhod1
     * @return test
     */
    @PostMapping("/method1")
    public String method1(){
        Logger.info("method1 called");

        String code = new String();
        code = "Alarm01.wav";

        soundLogic.sound(code);

            return "test";
    }

    /**
     * medhod2
     * @return test
     */
    @PostMapping("/method2")
    public String method2(){
        Logger.info("method2 called");

        String code = new String();
        code = "Alarm02.wav";

        soundLogic.sound(code);

            return "test";
    }

}
