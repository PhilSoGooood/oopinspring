package ch3;

public class 쥐 extends 동물 {
	쥐() { myClass = "쥐";}

	@Override
	void 울어보세요() {
		System.out.printf("나는 %s! 찍! 찍!\n", myClass);
	}
}
