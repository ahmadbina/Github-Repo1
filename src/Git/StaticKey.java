package Git;

	


public class StaticKey{
	//globla vars : the scope og global vars will be available across all the functions with some conditions.

		String name = "tom"; // non static global variable 
		static int age =25; // static global vari
	public static void main(String[] args) {
		// how to call static methods and vars?
		//1. direct calling:
		sum();
		// 2. calling by classnam;
		StaticKey.sum();
		System.out.println(age);
		System.out.println(StaticKey.age);
		
		// how to call non static method and varis?
		StaticKey obj = new StaticKey();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static methods by using object reference? yes
		obj.sum();
		
	}
	public void sendMail() {// non static method 
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method ");
	}
	

}
