
public class StringExample4 {
	// 문자열 자르기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday ="2000/01/01";
		String year =birthday.substring(0,4);
		String day =birthday.substring(8);
		System.out.println(year);
		System.out.println(day);
	}

}
