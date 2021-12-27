package ch4.finalMethod;

public class 동물 {
	final void 숨쉬다() {
		System.out.println("호흡 중");
	}
}

// class 포유류 extends 동물 {
// 	// '숨쉬다()' cannot override '숨쉬다()' in '동물'; overridden method is final
// 	void 숨쉬다(){
// 		System.out.println("호흡 중");
// 	}
// }
