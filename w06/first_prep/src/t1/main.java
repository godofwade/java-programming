package t1;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter N: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			Lotto lotto = new Lotto();
		}
	}

}

class Lotto{
	Date date;
	int[] num = new int[6];
	Random rand = new Random();
	int temp;
	
	public Lotto() {
		date = new Date();
		for(int j=0;j<6;j++){
	        do{
	           temp = rand.nextInt(49)+1;
	        }while(duplicate(num,j));

	        num[j] = temp;
	        System.out.printf("%02d ", num[j]);
	     }
		System.out.println();
	}
	
	private boolean duplicate(int[] num, int pos) {
		for(int i=0;i<pos;i++){
		    if(num[i]==num[pos]) return true;
		  }
		  return false;
	}
}

class Date{
	int year;
	int month;
	int day;
	Random rand = new Random();
	public Date() {
		this.year = rand.nextInt(11)+2010;
		this.month = rand.nextInt(12)+1;
		this.day = rand.nextInt(31)+1;
		System.out.printf("%d/%02d/%02d   ", this.year, this.month, this.day );
	}
}