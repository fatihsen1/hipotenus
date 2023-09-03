import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //Değişkenleri oluşturalım
        int a,b;
        double c;


        //kullanıcıdan verileri alalım

        Scanner inp = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz: ");
        a = inp.nextInt();

        System.out.print("2.Kenarı Giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus: "+ c);












        }
    }
