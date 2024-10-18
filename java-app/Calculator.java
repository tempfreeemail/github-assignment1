import java.util.Scanner;

public class Calculator{
	public static int getSum(int a, int b, int c){
		if(a < b && a < c){
			if(b > c){
				return a + b;
			}
			
			if(c > b){
				return a + c;
			}
		}
		
		if(b < a && b < c){
			if(a > b){
				return a + b;
			}
			
			if(c > b){
				return b + c;
			}
		}
		
		if(c < b && c < a){
			if(c > a){
				return c + a;
			}
			
			if(c > b){
				return b + c;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result = getSum(a, b, c);
			
		System.out.println("Sum of largest and smallest number : " + result);
	}
}
