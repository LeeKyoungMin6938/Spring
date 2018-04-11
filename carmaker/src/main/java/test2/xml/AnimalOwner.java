package test2.xml;

//동물들이 주인을 보자 좋아서 울어댄다

public class AnimalOwner {
	private animal a; //애니멀 선언. 

	public void setA(animal a) { //애니멀 세팅
		this.a = a;
	}
	
	public void watch() {
		this.a.bark();
	}
}
