package com.sztech.demo.Tomcat7;

/**
 * @program: Tomcat
 * @description:
 * @author: jiefu
 * @create: 2019-01-02 15:39
 **/
public class FindGirlServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get dirl...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {

        try {
            myResponse.write("post girl...");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
