package test.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CoffeeManager {
	private CoffeeMaker maker;

	@Autowired
	@Qualifier("phillips")
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	
	public void order() {
		this.maker.coffeeExtract();
	}
}
