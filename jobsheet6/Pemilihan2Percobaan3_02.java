import java.util.Scanner;

public class Pemilihan2Percobaan3_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut1 : ");
        sudut1 = input02.nextInt();

        System.out.print("Masukkan sudut2 : ");
        sudut2 = input02.nextInt();

        System.out.print("Masukkan sudut3 : ");
        sudut3 = input02.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("total sudut : " +totalSudut);

        if (totalSudut == 180){
            if ((sudut1 == 00) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("siku siku");
            else
            System.out.println("bukan siku siku");
        }else
        System.out.println("bukan segitiga");
        
    }
}
