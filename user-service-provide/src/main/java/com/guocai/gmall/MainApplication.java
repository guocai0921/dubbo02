package com.guocai.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((ClassPathXmlApplicationContext) context).start();
        System.out.println(context);
        System.in.read();
    }

}
