package ch4.finalClass;

public final class 고양이 {
}

// The type 길고양이 cannot subclass the final class 고양이
// 클래스에 final을 사용하는것은 상속을 허락하지 않는다는 의미이다. 따라서 길고양이와 같은 하위 클래스를 만들 수 없다.
// public final class 길고양이 extends 고양이 {}