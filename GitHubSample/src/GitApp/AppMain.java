package GitApp;

public class AppMain {
public static void main(String[]arges) {
	 System.out.println("3nd Version");
	 Math cMath = new  Math();
	 System.out.println();
	 System.out.println(cMath.add(10,5));
	}
}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}