package sec04.exam01;

public class PrintExample {
	// printf메소드사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);
		
		
		
		double area =3.14159 *10*10;
		System.out.printf("반지름이 %d원인 넓이: 10.2f\n",10,area);
		
		String name ="정상수";
		String job ="명사수";
		System.out.printf("%6d | %-10s | %10s\n" ,1 ,name, job);
	}

}
