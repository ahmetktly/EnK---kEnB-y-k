import java.util.Scanner;

public class smallestBiggestNum{

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        
        int numNum , newNum = 0 , bigNum  , smallNum=0 , i=2;

        System.out.println("Kaç adet sayıyı karşılaştırmak istersiniz? :");

        numNum=inp.nextInt();

        if(numNum >= 2){

        System.out.println( "1'inci sayıyı giriniz");

            bigNum=inp.nextInt();
            smallNum=bigNum;

        do{

            System.out.println(i+ "'inci sayıyı giriniz");

            newNum=inp.nextInt();
            

            if(newNum >= bigNum){

                bigNum = newNum ;

            }
            else {

                smallNum = newNum ; 
            }
           
            i++;
        }
        while(i <= numNum);
        System.out.println("Büyük Sayı= "+bigNum);
        System.out.println("Küçük sayı= "+smallNum);
    }
    else {

        System.out.println("Kıyaslama için en az 2 sayı gerekli");
    }
    }
}