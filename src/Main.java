public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println(" Задание 1");

        for ( int a = 0; a <= 10; a++){
        System.out.println( a );
        }



        // Задание 2
        System.out.println(" Задание 2");

        for ( int b = 10; b >= 0 ; b--){
            System.out.println( b );
        }

        // Задание 3
        System.out.println(" Задание 3");

         for ( int c = 0; c < 17; c = c+2) {
             System.out.println(c);
         }

        // Задание 4
        System.out.println(" Задание 4");

        for ( int d = 10; d >= - 10; d--) {
            System.out.println(d);
        }


        // Задание 5
        System.out.println(" Задание 5");

        for ( int i = 1904; i < 2096; i = i+4) {
            System.out.println( i + " год является високосным ");
        }


        // Задание 6
        System.out.println(" Задание 6");

        for ( int f = 7; f <= 98; f = f+7) {
            System.out.println(f);
        }


        // Задание 7
        System.out.println(" Задание 7");

        for ( int g = 1; g <= 512; g = g*2) {
            System.out.println(g);
        }


        // Задание 8
        System.out.println(" Задание 8");

        int salary = 29000;
        int total = 0;
        for ( int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println( " Месяц " + i + ", сумма накоплений равна " + total);
        }









    }

}