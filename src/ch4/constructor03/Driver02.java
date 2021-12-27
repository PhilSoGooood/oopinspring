package ch4.constructor03;

public class Driver02 {
	public static void main(String[] args) {
		동물 뽀로로 = new 동물("뽀로로");

		// 이미 인자가 있는 생성자가 있으므로 기본 생성자는 자동으로 생성되지 않는다.
		// 동물 무명 = new 동물();
	}
}
