package info.czajkowska.spring.implemantation;

import info.czajkowska.spring.api.Logger;
import info.czajkowska.spring.api.UsersRepository;
import info.czajkowska.spring.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;// zmienna przechowująca loggera
	
	
	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {//constructor 2 argumentowy/repozytorium ma parametry, które mają nazwy
		this.logger = logger;
		logger.log("Lokalizacja repozytorium:" + localization + "/" + dbName);
	}


	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}
}
