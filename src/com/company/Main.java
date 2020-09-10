package com.company;

public class Main {
    public static void main(String[] args) {

        byte b1 = 1;
        short a1 = 1;
        int i1 = 1;
        long l1 = 1;

        boolean bool = false;

        float fl = 1.2f;
        double d1 = 1.2;

        char character = 'd';
        char cl = '\ua24a';

        final String WORD = "loh";

        int a = 2;
        int b = 2;
        int c = 10;
        int d = 2;

        System.out.println(math(a,b,c,d));
        System.out.println(prov1(c,d));
        prov2(-10);
        System.out.println(prov3(2));
        hallo("andriy");
        ears(1948);
    }

    public static int math (int a, int b, int c,int d){
        return a * (b += (c / d));
    }

    public static boolean prov1 (int a, int b){
        int sum = a + b;

        if (sum >= 10 && sum <= 20){
            return true;
        }
        return false;

    }

    public static void prov2 (int a){
        if (a < 0){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
    }

    public static boolean prov3 (int a){
        if (a < 0){
            return true;
        } return false;

    }

    public static void hallo (String a){
        System.out.println("hallo " + a);
    }

    public static void ears (int a){

        if(a >= 100){
            if ((a / 100) % 4 == 0){
                System.out.println("год высокосный");
            } else System.out.println("год не высокосний");
        } else if (a % 4 == 0){
            System.out.println("год высокосный");
        } else System.out.println("год не высокосний");
    }




}

