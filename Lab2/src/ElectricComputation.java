import java.util.Scanner;

public class ElectricComputation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double soDien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        soDien = scanner.nextDouble();
        if (soDien < 50) {
        	System.out.println("Số tiền: " + (soDien * 1000));
        }
        else {
			System.out.print("Số tiền: " + ((50*1000) + ((soDien-50)*1200)));
		}
        
	}
}
