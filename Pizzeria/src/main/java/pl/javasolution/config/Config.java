package pl.javasolution.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javasolution.implementation.ExoticPizza;
import javasolution.implementation.Order;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

@Configuration
public class Config {
@Bean
public IPizza pizza() {
//	return new GoodPizza(15, "Dobra");
	return new ExoticPizza(17, "Egzotyczna");
}
@Bean(name = "inna")
public IOrder order(IPizza pizza) {
	return new Order(pizza);
}

}
