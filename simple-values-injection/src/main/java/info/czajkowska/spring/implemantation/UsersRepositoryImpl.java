package info.czajkowska.spring.implemantation;

import info.czajkowska.spring.api.Logger;
import info.czajkowska.spring.api.UsersRepository;
import info.czajkowska.spring.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;// zmienna przechowująca loggera

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {

		this.logger = logger;
	}

}
