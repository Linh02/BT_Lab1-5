import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public SanPham(String _tenSp, double _donGia, double _giamGia) {
		this.tenSp = _tenSp;
		this.donGia = _donGia ;
		this.giamGia = _giamGia;
	}
	//10% giá
	public double getThueNhapKhau() {
		return donGia * 0.1;
	}
	//nhập dl
	public void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print("Nhập tên SP: ");
		tenSp = bp.nextLine();
		System.out.print("Nhập đơn giá SP: ");
		donGia = bp.nextDouble();
		System.out.print("Nhập giảm giá SP: ");
		giamGia = bp.nextDouble();
	}
	public void xuat() {
		System.out.println("tên sản phẩm: " + tenSp);
		System.out.println("giá sản phẩm: " + String.valueOf(donGia));
		System.out.println("Giảm giá: " + String.valueOf(giamGia));
		System.out.println("Thuế nhập khẩu: " + String.valueOf(getThueNhapKhau()));

	}
}
