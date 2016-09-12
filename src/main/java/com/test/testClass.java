package com.test;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author kin
 * @version $: v 0.1 2016/9/5 Exp $$
 */
@Controller
public class testClass {

    public static Logger logger= Logger.getLogger(testClass.class);
    //PropertyConfigurator.configure

    @RequestMapping("/hhh")
    @ResponseBody
    public  String hello(){
        logger.debug("12111");
        return "helloworld123";
    }
    @RequestMapping("/sss")
    public String chenggong(){
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/gjson")//,produces = "application/json;charset=UTF-8")
    public String getJson(){
        JSONObject jsonstr=new JSONObject();
        jsonstr.put("id",1);
        jsonstr.put("name","zipon");
        System.out.println(jsonstr);
        return String.valueOf(jsonstr);
    }
}
