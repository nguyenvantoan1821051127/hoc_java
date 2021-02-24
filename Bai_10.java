import java.util.Scanner;
public class Bai_10 {

	public static void main(String[] args) {
		String chuoi;
		char kytu;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
	        chuoi = scanner.nextLine();
	    } while (chuoi.length() > 80);
		System.out.println("Nhập vào 1 ky tu bất kỳ: ");
        kytu = scanner.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("ky tu "+kytu+" trong chuoi "+ chuoi+" co "+count);
       
}
}