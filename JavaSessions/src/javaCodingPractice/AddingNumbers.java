package javaCodingPractice;

public class AddingNumbers {
	
	int a , b =10 ;
	static int  c= 30;
	

	public static void main(String[] args) {
		AddingNumbers obj = new AddingNumbers();
		obj.addNum();
		int j=obj.addNum(6, 67, c);
		System.out.println(j);
	}
	
	public void addNum() {
		
		int result = a+b+c ;
		System.out.println(result);
	}
	
	public int addNum(int num1,int num2,int num3) {

		int result1 = num1+num2+num3;
		return result1;
	}

}
