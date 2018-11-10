package info.czajkowska.spring.api;

import info.czajkowska.spring.domain.User;

public interface UsersRepository {
	
User createUser (String name); //metoda tworząca użytkownika w oparciu o jego nazwę
void setLogger(Logger logger); //setter
}
