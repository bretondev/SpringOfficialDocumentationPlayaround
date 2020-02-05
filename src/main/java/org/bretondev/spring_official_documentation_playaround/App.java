package org.bretondev.spring_official_documentation_playaround;

import org.bretondev.spring_official_documentation_playaround.example.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
             
        ExampleBean eb = context.getBean("exampleBean", ExampleBean.class);
        
        System.out.println(eb.getName());
        
        ((ConfigurableApplicationContext)context).close();
        
    }
}
