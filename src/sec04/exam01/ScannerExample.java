package sec04.exam01;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String [] args) throws Exception {
		
		// 키보드에 입력받은 내용을 문자열로 출력하기 
		Scanner scanner =new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData =scanner.nextLine();
			System.out.println("입력된 문자열: \"" +inputData +"\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
	}
}
