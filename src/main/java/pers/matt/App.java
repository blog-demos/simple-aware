package pers.matt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.matt.bean.Student1;
import pers.matt.bean.Student2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-beanaware.xml");

        Student1 student1 = context.getBean(Student1.class);
        System.out.println(student1);

        Student2 student2 = context.getBean(Student2.class);
        System.out.println(student2);

    }
}
