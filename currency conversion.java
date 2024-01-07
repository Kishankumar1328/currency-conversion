import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inr :");
        double inr=sc.nextInt();
        double usd;
        double euro;
        double yen;
        
        usd=inr*0.0120;
        euro=inr*0.0109;
        yen=inr*1.75;
        System.out.println("INR TO USD:"+usd);
        System.out.println("INR TO Euro:"+euro);
        System.out.println("INR TO yen:"+yen);
        
        double iusd;
        double ieuro;
        double iyen;
        
        iusd=inr*83;
        ieuro=inr*91;
        iyen=inr*0.5020;
         System.out.println("USD TO INR:"+iusd);
         System.out.println("EURO TO INR"+ieuro);
         System.out.println("YEN TO INR"+iyen);
        
    }
}