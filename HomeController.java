package com.hamed.MyWebApp;


import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//we use controller anotation to handel requests

public class HomeController
{
    //by using RequestMapping => for witch request i want to handel this method
    @RequestMapping("home")
    //@ResponseBody
    //ResposeBody says whatever you are returning is actually the data, its not the page and image data
//    public String home(HttpServletRequest request, HttpServletResponse response){
//
//        HttpSession session = request.getSession();
//        //accept data from url, we should use HttpServletRequest as an object
//        String name = request.getParameter("name");
//        session.setAttribute("name", name );
//        System.out.println("hi world" + name);
//
//        //controller you are responsible to call this home.jsp page
//        return "home";
//        //path of the page is defined by prefix and the extention of the page is defined with the help of surffix so we can remove .jsp
//        public ModelAndView home(@RequestParam("name") String  myName)
//    {
//        //can hold to things the first one view ,name  and the second one is data so we can add as much object as we want
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", myName);
//        mv.setViewName("home");
//        return mv;
        //so we accepting a home request and then we accepting a name and we send data and view name
        //

    public ModelAndView home(Alien alien)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");
        return mv;
    }
}
