package test2.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//동물들이 주인을 보자 좋아서 울어댄다
@Service
public class AnimalOwner {
	@Autowired
	@Qualifier("dog")
	private animal a; //애니멀 선언. 

	public void setA(animal a) { //애니멀 세팅
		this.a = a;
	}
	
	public void watch() {
		this.a.bark();
	}
}
