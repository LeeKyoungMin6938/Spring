package edu.ojc.setter2;

import org.springframework.stereotype.Service;

@Service
public class Designer implements Emp {

	@Override
	public void gotoOffice() {
		System.out.println("디자이너 출근합니다");

	}

	@Override
	public void getoffWork() {
		System.out.println("디자이너 퇴근합니다");

	}

}
