package com.aaron.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");

        System.out.println("====================Constructor injection=====================");
        Messager messager = (Messager) context.getBean("messageWithIndex");
        messager.printMessageWithIndex();

        System.out.println("====================Injecting objects=====================");
        Triangle triangle = (Triangle) context.getBean("trangleShape");
        triangle.printTrangle();

        System.out.println("====================Inner Bean=====================");
        Triangle innerBeanTriangle = (Triangle) context.getBean("innerBean");
        innerBeanTriangle.printTrangle();

        System.out.println("====================Aliases=====================");
        Triangle aliasesTriangle = (Triangle) context.getBean("trangleShape-alias");
        aliasesTriangle.printTrangle();

        System.out.println("====================Collections=====================");
        Triangle collectionTriangle = (Triangle) context.getBean("collectionBean");
        collectionTriangle.printListPoints();
    }
}
