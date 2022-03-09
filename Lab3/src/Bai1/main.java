package Bai1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber snt = new PrimeNumber();
       
        snt.Nhap();        
        long a = snt.getN();
        
        if(snt.ktSNT(a)==true) System.out.println(a + " là số nguyên tố nhé!!!");
        else System.out.println(a + " không phải là số nguyên tố đâu!!!");
	}
}
