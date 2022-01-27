import java.util.Scanner;

public class KuvvetleriBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,kuvvet4=1,kuvvet5=1;
        //Kullanici tarafindan verilen sayidan kucuk olan 4. ve 5. kuvvetleri ekrana bas

        do{
            System.out.print("Lutfen bir sayi girin");
            a=input.nextInt();

            if(a>0){
                for(int i=1;i<=a;i++)
                {
                    kuvvet4*=4;
                    if(kuvvet4<=a){
                        System.out.println("("+i+")4. Kuvvet:" + kuvvet4);
                    }else{
                        break;
                    }
                }

                for(int i=1;i<=a;i++)
                {
                    kuvvet5*=5;
                    if(kuvvet5<=a){
                        System.out.println("("+i+") 5. Kuvvet:" + kuvvet5);
                    }else{
                        break;
                    }
                }
                a=1; //sonlandirmak icin.

            }else{
                System.out.print("Girdiginiz Sayi uygun degil, lutfen pozitif ve 0'dan buyuk bir sayi  girin,\n sonlandirmak icin 1 girin.");
            }
        }while(a!=1);
    }
}

