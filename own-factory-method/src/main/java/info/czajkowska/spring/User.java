package info.czajkowska.spring;

public class User {
	
	private String name;
	private int age;
	
	private User() {//prywatny konstruktor, w ten sposób nie będzie można tworzyć sobie instancji tego użytkownika w metodzie Main przez operator new
	}
	
	public static User getInstance(String name, int age) {//jedyny sposób uzyskania tego uzytkownika jest przez metodę getInstance
		User user = new User();//ta metoda fabrykująca musi być statyczną metodą
		user.name = name;
		user.age = age;
		return user;
	}

	@Override
	public String toString() {//ta metoda wygeneruje nam Stringa na podstawie użytkownika
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}

