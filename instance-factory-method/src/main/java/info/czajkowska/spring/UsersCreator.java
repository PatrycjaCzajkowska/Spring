package info.czajkowska.spring;

import java.util.logging.Logger;

public class UsersCreator {
	Logger logger = Logger.getLogger(this.getClass().getName());//JAVA dpstarcza standartowego API, w którym można tworzyć loggery do logowania

	public User createUser(String userName) {//w kreatorze: 
		logger.info("Tworzenie użytkownika " + userName);//logger ma różne metody: info, fine, itd.
		User user = new User();//tworzę użytkownika
		user.setName(userName);//przypisuję mu imię
		return user;
	}
	
}
