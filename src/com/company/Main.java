package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);
        System.out.print("N:");
        int N = input.nextInt();
        System.out.println(getNthOdd(array,N));
    }

    private static int getNthOdd(int[] array,int N) {
        int count=1;
        for(int number:array){
            if(number%2==0) {
                if(count==N)
                    return number;
                count++;
            }
        }
        return -1;
    }

    //initial - line : "1 2 45 2"
    //elements : ["1","2","45","2"]
    //array: [1,2,45,2]
    private static int[] getArray(Scanner input) {
        System.out.println("Introduceti elementele:");
        String line = input.nextLine();
        String[] elements = line.split(" ");
        int[] array = new int[elements.length];
        for(int i=0;i<elements.length;i++)
            array[i]=Integer.valueOf(elements[i]);
        return array;
    }
}
