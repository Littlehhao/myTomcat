package com.sztech.demo.Tomcat7;

/**
 * @program: Tomcat
 * @description:
 * @author: jiefu
 * @create: 2019-01-02 15:42
 **/
public class HelloWorldServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get helloWorld...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {

        try {
            myResponse.write("post helloWorld...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
