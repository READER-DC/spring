package ua.kyiv.sehal.springhello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppContext.class);
        
        PersonBean person = context.getBean(PersonBean.class);
        
        System.out.printf("%s - %-4d\n", person.getName(), person.getAge());
        System.out.println(person);
        
        person.setAge( person.getAge() - 8 );
        
        System.out.printf("%s - %4d\n", person.getName(), person.getAge());
        System.out.println(person);
        
        context.close();
    }
}
