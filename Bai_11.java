import java.util.Scanner;
public class Bai_11 {

	public static void main(String[] args) {
		int n,temp;
		Scanner scanner=new Scanner(System.in);
		do {
		System.out.println("nhap vao so phan tu cua mang");
		n=scanner.nextInt();
		}while(n<0);
		int A[]=new int[n];
		System.out.println("nhap cac phan tu ch mang:");
		for( int i=0;i<n;i++) {
			 System.out.print("A[" + i + "] = ");
			 System.out.println("\nMảng ban dau: ");
		        A[i] = scanner.nextInt();
		}
		//in ra mang ban dau
		for (int i = 0; i < n; i++) {
			 System.out.println(A[i]  );
		}
		for(int i=0;i<n-1;i++) {
			for (int j = i+1; j <= n - 1; j++) {
	            if (A[j] < A[i]) {
	                temp = A[i];
	                A[i] = A[j];
	                A[j] = temp;
	            }
	        }
			
		}System.out.println("\nMảng sau khi sắp xếp: ");
	    for (int i = 0; i < n; i++) {
	        System.out.println(A[i] + "\t");
	    }	
		
}
}


