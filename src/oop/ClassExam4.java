package oop;

public class ClassExam4 {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int tmp = num1;  // num1의 내용을 tmp에 저장해둠.
		num1 = num2;
		num2 = tmp;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	// Swap하기

}
