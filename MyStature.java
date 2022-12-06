import java.sql.SQLOutput;
import java.util.Scanner;

public class MyStature {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемую высоту вашей ели:");
        int treeHeight = in.nextInt();

        for (int i = 0; i <= treeHeight; i++) {
            for (int j = treeHeight; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >=1; k--) {
                System.out.print(" ^");
            }
            System.out.println();
        }



    }
}



