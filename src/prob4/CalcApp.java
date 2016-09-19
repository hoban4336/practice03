package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			String tmp = s.nextLine();
			String[] arg = tmp.split("");
			a = Integer.parseInt(arg[0]);
			b = Integer.parseInt(arg[2]);
			if(arg.length<0){
				break;
			}
			if (arg[1].equals("+")) {
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				continue;
			}
			if (arg[1] == "-") {
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				continue;

			}
			if (arg[1] == "*") {
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				continue;

			}
			if (arg[1] == "/") {
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				continue;
			}
		}
		
		s.close();

	}
}
