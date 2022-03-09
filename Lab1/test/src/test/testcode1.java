package test;

import java.util.Scanner;

public class testcode1 {
	private double cDai, cRong, chuVi, dienTich;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhập chiều dài");
		cDai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		cRong = scanner.nextDouble();
	}
	
	public double getcDai() {
		return cDai;
	}


	public void setcDai(double cDai) {
		this.cDai = cDai;
	}


	public double getcRong() {
		return cRong;
	}


	public void setcRong(double cRong) {
		this.cRong = cRong;
	}

	public double tinhCV(double dai, double rong) {
		chuVi = ( dai + rong) * 2;
		return chuVi;
	}
	
	public double tinhDT(double dai, double rong) {
		dienTich = dai * rong;
		return dienTich;
	}
}
