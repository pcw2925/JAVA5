package sec04.exam01;

public class KeyCodeExample {
	// 입력된 키코드를 변수에 저장 
	public static void main(String[] args) throws Exception	{
		// TODO Auto-generated method stub
		int keyCode;
		
		keyCode =System.in.read();
		System.out.println("KeyCode:" +keyCode);
		
		keyCode =System.in.read();
		System.out.println("KeyCode:" +keyCode);
		
		keyCode =System.in.read();
		System.out.println("KeyCode:" +keyCode);
	}

}
