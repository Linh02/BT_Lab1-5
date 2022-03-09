package Bai3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float canh;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập cạnh của hình lập phương: ");
		canh = scanner.nextFloat();
		
		float thetich = canh * canh * canh;
		thetich = (float) Math.pow(canh, 3);
		
		System.out.print("Thể tích hình lập phương: " + thetich);
	}

}
