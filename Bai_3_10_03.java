import java.util.Scanner;
public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MATRAN m=new MATRAN();
		m.nhap_mt();
		m.xuat_mt();
		m.kiem_tra();
	}

}
class MATRAN{
	int n;
	int A[][];
	void nhap_mt(){
		Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so bac cua ma tran: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] A = new int[n][n];
        System.out.println("Nhap phan tu ma tran A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
	}
	void xuat_mt() {
		System.out.println("Ma trận A: ");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j]+ "\t");
	        }
	        System.out.println("\n");
	}
}
	void kiem_tra() {
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && A[i][j] != 1) || (i != j && A[i][j] != 0)) {
            		  System.out.println("ham tren la ma tran don vi");
            	  }else {
            		  System.out.println("ham tren khong la ma tran don vi");
            		  }
            	  }
                                    
                                 
                      
          }
	
}
}