package sk.kosickaakademia.hingis.math.planimetry.cycle;

public class uloha161020 {
    public static void main(String[] args) {
        uloha161020 haha = new uloha161020();
        haha.outputNumbers();
        haha.dividedSum();
    }
    public void skola(){
        String txt = "SKOLA";
        String[] text = new String[txt.length()];

        for (int i = 0; i <= txt.length(); i++){
            for (int j = i; j < txt.length(); j++){
                char ch = txt.charAt(j);
                text[j] = String.valueOf(ch);
                System.out.print(text[j]);
            }
            System.out.println();
        }
    }
    public void outputNumbers(){
        String numbers = "8X75Y2";
        int x = 1;
        int y = 1;
        while (x <= 9) {
            int number = 0;
            for (int j = 0; j < numbers.length(); j++ ){
                char ch = numbers.charAt(j);
                if (ch<=57&&ch>=49){
                    number += (ch-'0') * Math.pow(10, numbers.length()-1-j);
                }
                if (ch == 'Y'){
                    number += y * Math.pow(10, numbers.length()-1-j);
                }
                if (ch == 'X'){
                    number += x * Math.pow(10, numbers.length()-1-j);
                }
            }
            if(number%91 == 0){
                System.out.println(number);
            }
            if(y == 9){
                y = 0;
                x++;
            }
            y++;
        }
    }
    public void dividedSum(){
        double x;
        double sum = 0;
        for (int i = 1; i<=100; i++){
            x = (float) 1/i;
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
