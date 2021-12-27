package ch4.staticBlock;

public class Driver05 {
	public static void main(String[] args) {
		System.out.println("main 메서드 시작!");
		// 클래스의 static 블록이 Animal.age 보다 먼저 실행
		System.out.println(Animal.age);
	}
}

class Animal {
	static int age = 0;

	static {
		System.out.println("Animal class ready on!");
	}
}
