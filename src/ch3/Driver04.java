package ch3;

public class Driver04 {
	public static void main(String[] args) {
		동물[] 동물들 = new 동물[4];

		동물들[0] = new 쥐();
		동물들[1] = new 고양이();
		동물들[2] = new 강아지();
		동물들[3] = new 송아지();

		for(int i=0; i < 동물들.length; i++){
			동물들[i].울어보세요();
		}
	}
}