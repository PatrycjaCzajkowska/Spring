package pl.javasolution.Pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javasolution.implementation.Order;
import pl.javasolution.api.IOrder;
import pl.javasolution.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//       IOrder order = (IOrder)context.getBean("inna");
       IOrder order = context.getBean(Order.class);
       order.printOrder();
//    	IOrder order = new Order(new GoodPizza(15, "Dobra"));
//    	IOrder order = new Order(new ExoticPizza(17, "Egzotyczna"));
//    	order.printOrder();
    }
}
