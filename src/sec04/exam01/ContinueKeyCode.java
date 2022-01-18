package sec04.exam01;

public class ContinueKeyCode {
	
	public static void main(String[] args) throws Exception {
		
		// 입력된 키의 개수와 상관없이 키코드 읽기 
		// TODO Auto-generated method stub
		int keyCode;
		
			while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:" +keyCode);
		}
	}

}
