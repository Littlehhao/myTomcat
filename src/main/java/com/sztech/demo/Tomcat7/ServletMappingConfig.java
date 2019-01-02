package com.sztech.demo.Tomcat7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Tomcat
 * @description:
 * @author: jiefu
 * @create: 2019-01-02 15:46
 **/
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList=new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("fingGirl","/girl","com.sztech.demo.Tomcat7.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld","/helloWorld","com.sztech.demo.Tomcat7.HelloWorldServlet"));
    }
}
