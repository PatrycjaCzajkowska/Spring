package info.czajkowska.spring.api;

public interface Logger {

	void log(String message);
	void setName(String name);
	void setVersion(int version);
}
