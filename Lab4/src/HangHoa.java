
public class HangHoa {
	private String tenHH;
	private double donGia;
	private double giamGia;
	//xây dựng các hàm khởi tạo
	public HangHoa(String tenHH, double donGia, double giamGia) {
		super();
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	public HangHoa(String tenHH, double donGia) {
		super();
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	public String getTenHH() {
		return tenHH;
	}
	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	
	
	//khởi tạo giá trị ban đầu cho các thuộc tính
	
}
