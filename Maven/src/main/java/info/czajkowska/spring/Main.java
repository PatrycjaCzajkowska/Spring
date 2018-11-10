package info.czajkowska.spring;

import info.czajkowska.spring.api.Logger;
import info.czajkowska.spring.api.UsersRepository;
import info.czajkowska.spring.domain.User;
import info.czajkowska.spring.implemantation.LoggerImpl;
import info.czajkowska.spring.implemantation.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		User user = usersRepository.createUser("Janek");
	}

}
