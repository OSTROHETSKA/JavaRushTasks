package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y1 - y2) * (y1 - y2) + (x1 - x2) * (x1 - x2));

        }


        public static void main(String[] args) {

    }
}