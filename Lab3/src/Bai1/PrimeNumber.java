package Bai1;

import java.util.Scanner;

public class PrimeNumber {
	long n;
  
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số để kiểm tra số nguyên tố: ");
        n = scanner.nextLong();

    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }
    
    public boolean ktSNT(long n)
    {
        if(n<=1) return false;
        else if(n<4) return true;
                else
                    {
                        int dem=0;
                        for(long i=2;i<Math.sqrt(n);i++)
                        {
                            if(n%i==0)
                            {
                                dem++;
                                break;
                            }
                                
                        }
                        if(dem==0) return true;
                        else return false;
                    }
    }
}
