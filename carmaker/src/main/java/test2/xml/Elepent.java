package test2.xml;

import org.springframework.stereotype.Service;

@Service
public class Elepent implements animal {

	@Override
	public void bark() {
		System.out.println("뿌옹");

	}

}
