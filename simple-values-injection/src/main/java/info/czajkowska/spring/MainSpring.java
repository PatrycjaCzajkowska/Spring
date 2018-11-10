package info.czajkowska.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.czajkowska.spring.api.UsersRepository;
import info.czajkowska.spring.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);

		User Janek = usersRepository.createUser("Janek");

	}

}
