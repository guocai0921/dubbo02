package com.guocai.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * java类简单作用描述
 *
 * @ClassName: ApplicatinMain
 * @Package: com.guocai.main
 * @Description: <  >
 * @Author: Sun GuoCai
 * @CreateDate: 2018/9/12 16:41
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class ApplicationMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*OrderService orderService = ac.getBean(OrderService.class);
        orderService.initOrder("1");*/
        System.out.println(ac);
        System.in.read();
    }
}
