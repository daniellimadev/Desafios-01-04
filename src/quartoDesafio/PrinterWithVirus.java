package quartoDesafio;

import java.util.Scanner;

public class PrinterWithVirus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numbens = scanner.nextInt();
        for (int i = 0; i < Numbens; i++) {
            String phrase = readLine(scanner);
            StringBuilder part1 = new StringBuilder(phrase.substring(0, phrase.length() / 2));
            StringBuilder part2 = new StringBuilder(phrase.substring(phrase.length() / 2));
            part1.reverse();
            part2.reverse();
            System.out.println(part1.toString() + part2.toString());
        }
    }

    public static String readLine(Scanner scanner) {
        String line = scanner.nextLine();
        while (line.isEmpty())
            line = scanner.nextLine();
        return line;
    }
}
