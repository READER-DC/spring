package ua.kyiv.sehal.springhelloxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        PersonBean person = context.getBean("PersonBean", PersonBean.class);
        System.out.printf("%s - %-4d", person.getName(), person.getAge());
        
        context.close();
    }
}
