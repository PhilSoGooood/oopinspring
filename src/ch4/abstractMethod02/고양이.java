package ch4.abstractMethod02;


public class 고양이 extends 동물 {
	// The type 고양이 must implement the inherited abstract method 동물.울어보세요()
	// 추상 메서드는 하위 클래스에게 메서드의 구현을 강제한다. 오버라이딩 강제.
	void 울어보세요() {
		System.out.println("나는 고양이! 야옹! 야옹!");
	}
}
