package test2.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class animalmain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("animal2.xml");
		AnimalOwner owner = (AnimalOwner) ctx.getBean("animalOwner");
		owner.watch();

	}

}
