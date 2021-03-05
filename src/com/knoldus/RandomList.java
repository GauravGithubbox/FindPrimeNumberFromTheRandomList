package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomList {

    public void GenratingRandomList() {
        Random r = new Random();
        List<Integer> RandomNumbers = new ArrayList<Integer>();

        for (int counter = 1; counter <= 100; counter++) {
            RandomNumbers.add(r.nextInt(1000));


        }
        System.out.println("---------------------Random List of 100 Numbers------------------------------------------");
        System.out.print(RandomNumbers + " ");


        System.out.println();
        System.out.println("--------------------- List of prime Numbers------------------------------------------");
        System.out.println(RandomNumbers.stream()
                .filter(PrimeNumberUsingStream::isPrime)
                .collect(Collectors.toList()));


    }
}