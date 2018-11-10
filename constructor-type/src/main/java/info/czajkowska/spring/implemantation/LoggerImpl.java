package info.czajkowska.spring.implemantation;

import java.util.Date;

import info.czajkowska.spring.api.Logger;

public class LoggerImpl implements Logger {

	private String name;
	private int version;
	
	public void log(String message) {	
System.out.println(new Date() + " [" + name + " v." + version + "]:" + message);
	}

	public void setName(String name) {//dla metody setName ustawiam pole name
		this.name = name;
		
	}

	public void setVersion(int version) {
		this.version=version;
		
	}

}
