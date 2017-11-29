package com.mkyong.common;

import java.beans.beancontext.BeanContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        obj.setName("Prashant");
        obj.printHello();
        
        
        HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
        obj1.printHello();
        
        D d = (D) context.getBean("D");
        B c =(C)d;
        c.display("D");
        d.display("-D");
        
        
        D d1 = (D) context.getBean("D1");
        B c1 =(C)d1;
        c1.display("D1");
        d1.display("-D1");
        
        A a = (A) context.getBean("A");
        a.display();
    }
    
    
}
