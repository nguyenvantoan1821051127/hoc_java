import java.util.Scanner;
public class Bai_9 {

	public static void main(String[] args) {
		 String chuoi;
		    int chuhoa = 0, chuthuong = 0, chuso = 0;
		    Scanner scanner = new Scanner(System.in);
		         
	
		    do {
		        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
		        chuoi = scanner.nextLine();
		    } while (chuoi.length() > 80);
		         

		    for (int i = 0; i < chuoi.length(); i++) {

		        if (Character.isUpperCase(chuoi.charAt(i))) {
		            chuhoa++;
		        } 

		        if (Character.isLowerCase(chuoi.charAt(i))) {
		            chuthuong++;
		        } 
		             
		        if (Character.isDigit(chuoi.charAt(i))) {
		            chuso++;
		        }
		    }
		         
		    System.out.println("Trong chuỗi " + chuoi +
		        " có " + chuhoa + " ký tự in hoa," +
		        " có " + chuthuong + " ký tự in thường" +
		        " và có " + chuso + " số.");
		}
}
