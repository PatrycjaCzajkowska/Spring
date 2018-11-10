package info.czajkowska.spring.domain;

public class User {

	private String name;

	public String getName() {//getter
		return name;
	}

	public void setName(String name) {//setter
		this.name = name;
	}

	public User(String name) {//constructor
		super();
		this.name = name;
	}
	
	
}
