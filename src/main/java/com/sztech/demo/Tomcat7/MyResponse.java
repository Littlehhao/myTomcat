package com.sztech.demo.Tomcat7;

import java.io.OutputStream;

/**
 * @program: Tomcat
 * @description: 响应
 * @author: jiefu
 * @create: 2019-01-02 15:14
 **/
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws Exception{

        StringBuffer httpResponse=new StringBuffer();
        httpResponse.append("http/1.1 200 ok\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();

    }
}
