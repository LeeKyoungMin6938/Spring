package edu.ojc.setter1;

public class Programmer implements Emp {

	@Override
	public void gotoOffice() {
		System.out.println("프로그래머 출근합니다");

	}

	@Override
	public void getoffWork() {
		System.out.println("프로그래머 퇴근합니다");

	}

}
