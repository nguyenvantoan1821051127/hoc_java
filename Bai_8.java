import java.util.Scanner;
public class Bai_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, sum = 0, number;
	        float tbc;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập dãy số: ");
	        n = scanner.nextInt();
	        for (int i = 1; i <=n; i++) {
	            System.out.println("Nhập số thứ " + i + ": ");
	            number = scanner.nextInt();
	            sum += number;
	        }
	         
	        tbc = (float) sum / n;
	        System.out.println("Trung bình cộng = " + tbc);
	    }
	 
	}