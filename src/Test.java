import java.util.Scanner;


public class Test {

	int age;
	
	void input(){
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age<0)
		{
			throw new NegativeAgeException("Invalid age : negetive");
		}
		else
		{
			System.out.println("Age is : " + age); 
		}
	}
	
	public static void main(String[] args) {

		Test t1 = new Test();
		t1.input();
		Test t = new Test();
		t.input();
	}

}
