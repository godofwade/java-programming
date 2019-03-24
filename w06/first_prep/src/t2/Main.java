package t2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height;
		Parallelogram para;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter height: ");
		height = scan.nextInt();
		for(int type=1; type<=2; type++) {
			para = new Parallelogram(height, type, true);
			System.out.println(para);
			para.draw();
			
			para = new Parallelogram(height, type, false);
			System.out.println(para);
			para.draw();
		}
	}

}
