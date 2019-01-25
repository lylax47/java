package com.company;

public class Main {

    public static void main(String[] args) {

        // has width of 32
        int myValue = 10000;
        int minValue = -2_147_483_648; //this is a literal. Can use underscores to make more readable.
        int maxValue = 2_147_483_647;
        int myTotal = maxValue/2;
        System.out.println(myTotal);

        //has width of 8
        byte minValueByte = -128;
        byte maxValueByte = 127;
        byte myByteTotal = (byte) (maxValueByte/2); //casting. telling java to convert to certain type.
        System.out.println(myByteTotal);

        //has width of 16
        short minValueShort = -32768;
        short maxValueShort = 32767;
        short myShortTotal = (short) (maxValueShort/2);
        System.out.println(myShortTotal);

        // long has width of 64. Do not need to cast longs. Can tak in integer because it's bigger.
        long longValue = 100L;

    }
}
