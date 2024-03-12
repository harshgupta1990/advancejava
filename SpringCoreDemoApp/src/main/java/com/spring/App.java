package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
        
        Item item = (Item) iocContainer.getBean("item");

        System.out.println("Item bean:- " + item);
    }
}
