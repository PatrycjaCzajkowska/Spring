package info.czajkowska.spring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainSpring {

	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();//z klasy Locale wywołujemy metodę statyczną fabrykująca getDefault
//		
//		Calendar calendar = GregorianCalendar.getInstance(locale);//klasa GregorianCalendar
//		
//		DateFormat formatter = SimpleDateFormat.getInstance();//metoda fabrykująca getInstance
//		
//		System.out.println(formatter.format(calendar.getTime()));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class);//pobranie beana bez rzutowania
		DateFormat formatter = (DateFormat)context.getBean("formatter");//pobranie beana z rzutowaniem
	
		System.out.println(formatter.format(calendar.getTime()));
	}

}
