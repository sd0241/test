package ch10;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max_num =100;
		//max_num =20; 상수(final)는 불변 하기떄문에 오류
		final int min_num;
		min_num=20;
	
		System.out.println(max_num);
		System.out.println(min_num);
	}

}
