import java.util.Scanner;
public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THOIGIAN t=new THOIGIAN();
		t.khoitao(0,0,0);
		t.nhap();
		t.xuat();
		t.hamchuyen();
	}

}
class THOIGIAN{
	   
    private int gio, phut, giay;
 
    int chuyen;
   
    public void khoitao(int gio, int phut, int giay){
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;        
    }
   
    public void nhap(){
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Nhap gio:");
        gio =scanner.nextInt();
        System.out.println("Nhap phut:");
        phut = scanner.nextInt();      
        System.out.println("Nhap giay: ");
        giay = scanner.nextInt();
    }
     void xuat(){
        System.out.println("Gia  tri thoi gian: "+gio+" giờ, "+phut+ " phút, "+giay+" giây" );
    }
  
    void hamchuyen(){
        chuyen = gio*3600 + phut*60 +giay;
        System.out.println("Chuyển đổi giá trị thời gian sang giây là: " +chuyen+" giây");
    }
   
}   