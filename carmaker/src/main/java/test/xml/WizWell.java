package test.xml;

import org.springframework.stereotype.Service;

@Service
public class WizWell implements CoffeeMaker {

	@Override
	public void coffeeExtract() {
		System.out.println("위즈웰커피");
	}

}
