package sec04.exam01;

public class QstopExample {

	public static void main(String[] args) throws Exception {
		// q를 입력하면 반복 종료 
		// TODO Auto-generated method stub
		int keyCode;

		while(true) {
			keyCode =System.in.read();
			System.out.println("keyCode:" +keyCode);
			if(keyCode ==113) {
				break;
			}
		}
		
		System.out.println("종료합니다 ");
	}

}
