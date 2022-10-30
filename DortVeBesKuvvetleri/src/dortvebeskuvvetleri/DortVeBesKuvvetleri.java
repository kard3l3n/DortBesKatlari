package dortvebeskuvvetleri;
import java.util.Scanner;
import java.math.*;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        int sayi;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayi giriniz:");
        sayi=input.nextInt();
        
        for(int i=1;i<=sayi;i++){
            for(int z=1;z<=sayi;z++){
                if(i==Math.pow(4, z) || i==Math.pow(5, z)){
                    System.out.println(i);
                }
                else{
                    
                }
            }
        }
    }
    
}
