package ch09;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str);
	}

}
