package ch3;

public class 고양이 extends 동물 {
	고양이() {
		myClass = "고양이";
	}

	@Override
	void 울어보세요() {
		System.out.printf("나는 %s! 야옹! 야용!\n", myClass);
	}
}
