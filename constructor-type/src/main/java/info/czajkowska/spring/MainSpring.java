package info.czajkowska.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import info.czajkowska.spring.implemantation.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

		SomeBean bean = context.getBean("someBean", SomeBean.class);

	}

}
