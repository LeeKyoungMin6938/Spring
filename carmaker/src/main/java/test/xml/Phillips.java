package test.xml;

import org.springframework.stereotype.Service;

@Service
public class Phillips implements CoffeeMaker {

	@Override
	public void coffeeExtract() {
		System.out.println("필립스커피");
	}

}
