package ch4.interface01;

interface Speakable {
	// (자바6 기준)인터페이스는 public 추상 메서드와 public 정적 상수가 가지고 있으므로 그외의 경우 자동으로 키워드가 생성된다.
	// 자동으로 생성된다고 하더라도 명시적으로 작성해주는 것이 더 명확하다.
	double PI = 3.14159;
	// public static final double PI = 3.14159; 로 자동 변환

	final double absoluteZeroPoint = -275.15;
	//public static final double absoluteZeroPoint = -275.15;로 자동 변환

	void sayYes();
	// public abstract void sayYes();로 자동 변환
}

class Speaker implements Speakable {
	public void sayYes() {
		System.out.println("I say No!!!");
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);

		Speaker reporter1 = new Speaker();
		reporter1.sayYes();
	}
}