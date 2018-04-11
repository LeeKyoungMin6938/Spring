package test2.xml;

import org.springframework.stereotype.Service;

@Service
public class Dog implements animal {

	@Override
	public void bark() {
		System.out.println("멍멍");

	}

}
