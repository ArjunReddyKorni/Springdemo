package demo.spring.niit;

import demo.spring.niit.spring.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration1.class);
       // Product product = context.getBean("product1", Product.class);
       // System.out.println("product = " + product);

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        System.out.println("context.getBean(\"productBean1\", Product.class) = " + context.getBean("productBean1", Product.class));
    }
}
