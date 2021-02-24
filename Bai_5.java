import java.util.Scanner;
public class Bai_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int number, sum = 0;
	        Scanner scanner = new Scanner(System.in);
	        
	        while (sum < 100) {
	            System.out.println("Nhập vào số nguyên bất kỳ: ");
	            number = scanner.nextInt();
	            sum += number; 
	        }
	        
	        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
	    }
	}



