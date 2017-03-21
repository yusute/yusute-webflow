package com.yusute.webflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yusute on 3/21/2017.
 */
@Controller
public class Log4j2Controller {

    public static Logger logger = LoggerFactory.getLogger(Log4j2Controller.class);
    @RequestMapping("/log4j2test")
    public String log4j2test(){
        logger.info("this is a test for log4j2!");
        return "";
    }
}
