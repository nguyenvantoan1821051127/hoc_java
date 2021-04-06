import java.util.Scanner;
public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SINHVIEN v= new SINHVIEN();
		v.nhap();
		v.in();
		v.tinhtbc();
	}

}
 class SINHVIEN{
	private String hoten,ngaysinh,gioitinh,lop;
	private double toan,ly,hoa,tbc=0;
	  public void nhap() {
	        Scanner scanner = new Scanner(System.in);   // scanner là biến cục bộ
	        System.out.println("Nhập họ tên sinh viên: ");
	        hoten = scanner.nextLine();
	        System.out.println("Nhập ngay sinh: ");
	        ngaysinh = scanner.nextLine();
	        System.out.println("Nhập gioi tinh: ");
	        gioitinh = scanner.nextLine();
	        System.out.println("Nhập lớp: ");
	        lop = scanner.nextLine();
	        System.out.println("Nhập điểm toán: ");
	        toan = scanner.nextDouble();
	        System.out.println("Nhập điểm lý: ");
	        ly = scanner.nextDouble();
	        System.out.println("Nhập điểm hóa: ");
	        hoa = scanner.nextDouble();
}
	  public void in() {
		  System.out.println("Họ tên sinh viên là: "+hoten);
	        System.out.println("Ngày sinh của sinh viên là: "+ngaysinh);
	        System.out.println("Giới tính của sinh viên là: "+gioitinh);
	        System.out.println("Lớp của sinh viên là: "+lop);
	        System.out.println("Điểm toán của sinh viên là: "+toan);
	        System.out.println("Điểm lý của sinh viên là:" +ly);
	        System.out.println("Điểm hóa của sinh viên là: "+hoa);
	  }
	  public void tinhtbc() {
		  tbc = (toan+hoa+ly)/3;
	        System.out.println("Điểm trung bình là: "+tbc);
	  }
}