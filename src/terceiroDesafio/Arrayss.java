package terceiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrayss {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numbers;

        System.out.printf("Informe o tamanho do lista:");
        numbers = scanner.nextInt();

        ArrayList<Integer> prohibited = new ArrayList<Integer>();
        ArrayList<Integer> pairNumbs = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbs = new ArrayList<Integer>();

        System.out.println("Informe os numeros da lista:");
        for (int i = 0; i < numbers; i++) {
            scanner = new Scanner(System.in);
            prohibited.add(scanner.nextInt());

            if (prohibited.get(i) % 2 == 0) {
                pairNumbs.add(prohibited.get(i));
            } else {
                oddNumbs.add(prohibited.get(i));
            }
        }

        Collections.sort(pairNumbs);
        Collections.sort(oddNumbs);
        Collections.reverse(oddNumbs);

        System.out.println("Numeros pares:");
        for (int pair : pairNumbs) {
            System.out.println(pair);
        }

        System.out.println("Numeros impares:");
        for (int odd : oddNumbs) {
            System.out.println(odd);
        }
        scanner.close();
    }
}
