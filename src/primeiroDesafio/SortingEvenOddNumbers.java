package primeiroDesafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class SortingEvenOddNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(buffered.readLine());

        int lines = Integer.parseInt(tokenizer.nextToken());

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            tokenizer = new StringTokenizer(buffered.readLine());
            numberList.add(Integer.parseInt(tokenizer.nextToken()));
        }

        var pairs = numberList.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var odd = numberList.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();
        total.addAll(pairs);
        total.addAll(odd);
        total.forEach(System.out::println);
    }

}
