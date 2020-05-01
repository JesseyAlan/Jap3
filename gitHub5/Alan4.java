package gitHub5;

import gitHub5.Alan4;

public class Alan4 {
	
	int a = 10;// instance variable
	static int b = 20; // static variable
	
	public Alan4() {
		
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
	}
	
	public static void main(String[] args) {
		
		Alan4 c = new Alan4();
		Alan4 c1 = new Alan4();
		Alan4 c2 = new Alan4();
	}


}
