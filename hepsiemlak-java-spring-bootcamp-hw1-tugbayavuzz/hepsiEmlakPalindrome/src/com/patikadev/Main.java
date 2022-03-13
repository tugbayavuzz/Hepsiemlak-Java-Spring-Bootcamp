package com.patikadev;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//reverse edilen zinciri dizide tutup her bir sayının zincirini listeye attık. En uzun zincire sahip olanı da cevabı vermektedir.
        String steps = "";
        for (int i = 10; i <= 100; i++) {//10 dan 100 e kadar olan sayıların reverse ediyoruz
            steps = i + "\n";
            BigInteger reverseNumber = reverseNumber(new BigInteger(i + ""));
            if (!reverseNumber.equals(new BigInteger(i + ""))) {
                BigInteger temp = new BigInteger(i + "").add(reverseNumber);
                steps = steps + i + " + " + reverseNumber + "\n";
                while (!temp.equals(reverseNumber(temp))) {
                    steps = steps.concat(temp + " + " + reverseNumber(temp) + "\n");
                    temp = temp.add(reverseNumber(temp));
                    if (temp.equals(reverseNumber(temp))) {
                        list.add(steps);
                        break;
                    }
                }
            }
        }

        String temp = list.get(0);
        for (String s : list) {
            if (s.length() >= temp.length()) { //listenin en uzun stringini alıp cevabı döndürmektedir.
                temp = s;
            }
        }

        System.out.println(temp);
    }

    static BigInteger reverseNumber(BigInteger number) {//sayıyı çeviren fonksiyon
        BigInteger reverse = BigInteger.ZERO, rem;
        while (!number.equals(BigInteger.ZERO)) {
            rem = number.mod(BigInteger.TEN);
            reverse = (reverse.multiply(BigInteger.TEN)).add(rem);
            number = number.divide(BigInteger.TEN);
        }

        return reverse;
    }
}
