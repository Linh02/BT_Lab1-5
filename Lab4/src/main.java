import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo, tạo mới 2 đối tượng
//		SanPham sp1 = new SanPham(null, 0, 0);
//		SanPham sp2 = new SanPham(null, 0, 0);
		HangHoa hh1 = new HangHoa("bút bi", 2000);
		HangHoa hh2 = new HangHoa("bút chì", 1000);
		//Nhập dl
//		sp1.nhap();
//		sp2.nhap();
		Scanner bp = new Scanner(System.in);
		System.out.print("Tên SP 1: ");
		String tenHH1 = bp.nextLine();
		hh1.setTenHH(tenHH1);
		System.out.print("Nhập đơn giá SP: ");
		hh1.setDonGia(bp.nextDouble());
		System.out.print("Nhập giảm giá SP: ");
		hh1.setGiamGia(bp.nextDouble());
		
		String s = bp.nextLine();
		System.out.println("===================================");
		System.out.print("Tên SP 2: ");
		String tenHH2 = bp.nextLine();
		hh1.setTenHH(tenHH2);
		System.out.print("Nhập đơn giá SP: ");
		hh2.setDonGia(bp.nextDouble());
		System.out.print("Nhập giảm giá SP: ");
		hh2.setGiamGia(bp.nextDouble());
		
		//Xuất thông tin
		System.out.println("=================================");
		System.out.println("tên sản phẩm: " + hh1.getTenHH() );
		System.out.println("giá sản phẩm: " + hh1.getDonGia());
		System.out.println("Giảm giá: " + hh1.getGiamGia());
		System.out.println("Thuế nhập khẩu: " + hh1.getDonGia()*0.1);
		System.out.println("=================================");
		System.out.println("tên sản phẩm: " + hh2.getTenHH() );
		System.out.println("giá sản phẩm: " + hh2.getDonGia());
		System.out.println("Giảm giá: " + hh2.getGiamGia());
		System.out.println("Thuế nhập khẩu: " + hh2.getDonGia()*0.1);
		
	}

}
