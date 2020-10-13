package sk.kosickaakademia.hingis.math.planimetry.cycle;

import java.util.Scanner;

public class TRANSFORMATOR {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner sys = new Scanner(System.in);
        System.out.println(" ==========================================================================================================================");
        System.out.println("|                                                                                                                          |");
        System.out.println("|                                                     TRANSFORMATOR 1.0                                                    |");
        System.out.println("|                                                                                                                          |");
        System.out.println("|     Application that is designed to help you convert a number expressed in decimal to binary, octave or hexadecimal.     |");
        System.out.println("|          In case you are stupid pig and don't know what the systems are, JUST OPEN YOUR BROWSER AND GOOGLE IT.           |");
        System.out.println("|           Otherwise follow instructions below, there are only two steps. You might easily get what you need.             |");
        System.out.println("|                                                                                                                          |");
        System.out.println(" ==========================================================================================================================");
        System.out.println();
        System.out.print("At first - type number: ");
        int n = num.nextInt();

        System.out.print("Great, now choose system by its numerical expression: ");
        int s = sys.nextInt();

        if (s == 2){
            while(n>0){
                int p = 0;
                int b = (int) (n%2*Math.pow(10, p));
                n = n/2;
                p++;
                System.out.print("Result (bin): "+b);
            }

        }
        else if (s == 8){
            while(n>0){
                int p = 0;
                int o = (int) (n%8*Math.pow(10, p));
                n = n/8;
                p++;
                System.out.print("Result (oct): "+o);
            }

        }
        else if (s == 16){
            String h = "";
            while(n>0){
                int z = n%16;
                n = n/16;
                switch (z){
                    case 10: h = "A"+h; break;
                    case 11: h = "B"+h; break;
                    case 12: h = "C"+h; break;
                    case 13: h = "D"+h; break;
                    case 14: h = "E"+h; break;
                    case 15: h = "F"+h; break;
                    default: h = ""+z+""+h;
                }
                /*if (z <= 9) {
                    h = "" + z + "" + h;
                }
                else if (z == 10) {
                    h = "A" + h;
                }
                else if (z == 11) {
                    h = "B" + h;
                }
                else if (z == 12) {
                    h = "C" + h;
                }
                else if (z == 13) {
                    h = "D" + h;
                }
                else if (z == 14) {
                    h = "E" + h;
                }
                else
                    h = "F" + h;

                n = n/16;*/
            }
            System.out.println("Result (hex): " + h);
        }
    }
}
