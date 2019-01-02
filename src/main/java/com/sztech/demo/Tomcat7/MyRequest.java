package com.sztech.demo.Tomcat7;

import java.io.InputStream;

/**
 * @program: Tomcat
 * @description: 请求处理类
 * @author: jiefu
 * @create: 2019-01-02 14:58
 **/
public class MyRequest {

    private String url;

    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MyRequest(InputStream inputStream) throws Exception {
        String httpRequest="";
        byte[] httpRequestBytes=new byte[1024];
        int length=0;
        if((length=inputStream.read(httpRequestBytes))>0){
            httpRequest=new String(httpRequestBytes,0,length);
        }

        //http请求协议解析

        String httpHead=httpRequest.split("\n")[0];
        url=httpHead.split("\\s")[1];
        method=httpHead.split("\\s")[0];
        System.out.println("url:"+this.url+"\n"+"method:"+this.method);

    }
}
