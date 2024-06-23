package com.hamed.MyWebApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//we use controller anotation to handel requests

public class HomeController
{
    //by using RequestMapping => for witch request i want to handel this method
    @RequestMapping("home")
    //@ResponseBody
    //ResposeBody says whatever you are returning is actually the data, its not the page and image data
    public String home(){
        System.out.println("hi world");
        //controller you are responsible to call this home.jsp page
        return "home.jsp";
    }
}
