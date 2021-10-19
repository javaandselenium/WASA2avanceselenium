package Locators;

public class Test5 {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a,int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
	Test5 t=new Test5();
	t.add(10,20);
	t.sub(200,50);

	}

}
