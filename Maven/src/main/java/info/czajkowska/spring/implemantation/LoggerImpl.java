package info.czajkowska.spring.implemantation;

import java.util.Date;

import info.czajkowska.spring.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {	
System.out.println(new Date() + ": " + message);
	}

}
