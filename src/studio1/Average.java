package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        int x = ap.nextInt("The first of two integers to be averaged?");
        int y = ap.nextInt("The second of two integers to be averaged?");
        System.out.println("The average is " + (x+y)/2.0);

    }
    }