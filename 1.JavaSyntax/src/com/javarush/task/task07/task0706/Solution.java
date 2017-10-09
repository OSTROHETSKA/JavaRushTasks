package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 != 0) {
                odd = odd + array[i];
            }
            else {
                even = even + array[i];
            }

        }
        if (odd > even) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }


    }
}
