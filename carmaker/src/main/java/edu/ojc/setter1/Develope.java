package edu.ojc.setter1;

public class Develope {
	Emp emp; //인터페이스 객체 불러옴
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	void coding() {
		emp.gotoOffice();
		System.out.println("개발합니다...");
		emp.getoffWork();
	}
}
