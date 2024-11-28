/* 
file:solution.java
Author: Ye Haoze
date: 2024-11-28
Github: https://github.com/40022808/
Group: II-2-N
*/
import java.util.Scanner;

public class solution {
    public void startCalc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Térfogat kiszámítás");

        System.out.print("Odal: ");
        String sidestr = sc.nextLine();
        Double side = Double.parseDouble(sidestr);


        System.out.print("Magaság: ");
        String heightstr = sc.nextLine();
        Double height = Double.parseDouble(heightstr);


        Double volume = 1.0 / 3.0 * Math.pow(side, 2) * height;


        System.out.printf("Térfogat: %.2f\n" , volume);
        sc.close();
    }
}
