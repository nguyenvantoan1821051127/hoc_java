import java.util.Scanner;
public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DIEM ht=new DIEM();
		ht.nhap_hd();
		ht.nhap_td();
		ht.xuat_td();
		ht.doixung();
		ht.kiemtra();
		ht.khoangcach();
	}

}
class DIEM{
	int x,y;
	int x1,y1;
	void nhap_hd(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hoang do: ");
    	x = scanner.nextInt();
	}
	void nhap_td(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tung do: ");
    	y = scanner.nextInt();
	}
	void xuat_td() {
		System.out.println("toa do (x,y) la: "+"("+x+","+y+")");
	}

	void doixung() {
		x1=x;
		y1=-y;
		System.out.println("toa do doi xung tren truc 0x: "+"("+x1+","+y1+")");
    }
	void kiemtra() {
		if(x==0) {
			System.out.println("x nằm trên trục hoành");
		}
		else if(y==0) {
			System.out.println("y nằm trên trục tung");
		}
		else {
			System.out.println("tọa độ x y không nằm trên trục nào cả");
		}
	}
	void khoangcach() {
		float d;
		d=(float) Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		System.out.println("khoang cách của 2 điển là" + d);
	}
	
}