import java.util.Scanner;

//Задана квадратная матрица. Поменять местами строку с максимальным
// элементом на главной диагонали со строкой с заданным номером.
public class Main {

    public static void main(String[] args) {
        int N = 0;
        int m = 0;
        System.out.println("Введите строку матричы которую надо поменять");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        M:
        for (int s = 0; s < 100; s++) {
            if (sc.hasNextInt()) {
                N = sc.nextInt();}
            if (N > 4) {
                System.out.println("Число больше 4, попробуйте еще раз");
                continue M;
            }else break ;
        }



        //if (sc.hasNextInt()) {
        //   N = sc.nextInt();
        int[][] mass = new int[5][5];
        for (int i = 0; i < mass.length; i++) {
            System.out.println();
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + mass[i][j]);
            }
        }
        System.out.println();
        n = 0;
        for (int i = 0; i < 5; i++) {
            if (i < 1 && mass[i][i] > mass[i + 1][i + 1]) {
                m = mass[i][i];
                n = i;
            }
            if (m < mass[i][i]) {
                m = mass[i][i];
                n = i;
            }
        }
        System.out.print(" Индекс максимального элемента "+n);
        for (int i = 0; i <= 4; i++) {
            m = mass[i][n];
            mass[i][n] = mass[i][N];
            mass[i][N] = m;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println();
            for (int j = 0; j < mass.length; j++) {

                System.out.print(" " + mass[i][j]);

            }
        }
    }
}

