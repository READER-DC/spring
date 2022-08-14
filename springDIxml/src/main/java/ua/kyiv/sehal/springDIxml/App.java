package ua.kyiv.sehal.springDIxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
    	/*
    	Window window = context.getBean("WindowBean", Window.class);
    	new House(window).view(); 
    		// ручное внедрение сами создали обьект доа и сами подскнкли окно (но в xml файле можно изменить 
    		//класс (тип окна) и без перекомпиляции изменить окно)
    	 */
    	House house = context.getBean("HouseBean", House.class);
    	house.view();
    	System.out.printf("Flor in house %-4d\n",house.getHeight());
    	 
    	
    	context.close();
    	
    }
}
