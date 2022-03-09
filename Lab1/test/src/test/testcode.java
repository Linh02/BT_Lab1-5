/**
 * 
 */
package test;
import test.testcode1;
import java.util.Scanner;
/**
 * @author Admin
 *
 */
public class testcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testcode1 hinhChuNhat = new testcode1();
        
        // nhập chiều dài và chiều rộng hình chữ nhật
		hinhChuNhat.nhap();
         
        // hiển thị chu vi và diện tích
		System.out.println(hinhChuNhat.tinhCV(hinhChuNhat.getcRong(), hinhChuNhat.getcDai()));
		System.out.println(hinhChuNhat.tinhDT(hinhChuNhat.getcRong(), hinhChuNhat.getcDai()));
}
}
