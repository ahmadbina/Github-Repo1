package Git;

public class Birds {

	public static void main(String[] args) {
		System.out.println(Bird.Egale("Egale\n sound:-frrrr", "\nFly:-high fly attiude 4000ft"));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(Bird.Prrat("Prrat\n Walk:- walking Fast", "\nEat:-eat anything"));

	}
	}
public static String Egale(String sound, String fly) {
	return sound+fly;
}
public static String Prrat(String Walk, String eat) {

	return Walk+eat;
}
}
