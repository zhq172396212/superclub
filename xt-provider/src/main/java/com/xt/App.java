package com.xt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext cx=  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        cx.start();
        System.out.println("开始");
        System.in.read();
    }
}
