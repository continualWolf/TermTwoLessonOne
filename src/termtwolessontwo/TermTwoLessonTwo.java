/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termtwolessontwo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 2475830
 */
public class TermTwoLessonTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Capital("mary has a little lamb");
//        RandomNumberTwo(9 , 100, 5);
        //RandomNumber(900 , 100);
       // SentenceCase("mary has a little lamb");
//        RollOfDiceCount(4);
//        RollOfDice();
        int[] arr = {1, 2 ,3 ,4};
//        GreatestNumber(arr);
//        SmallestNumber(arr);
        mean(arr); int a = 2_100_000_000;
// int b = 2_100_000_000;
// int c = 2_100_000_000;
//        System.out.println("Sum of a and b is = " + (a + b + c));
//
    }
    public static void Capital(String str){
        if(str == null) return;
        String[] arr = str.split(" ");
        for (String i : arr) {
            String cap = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();
            System.out.println(cap);
        }
    }
    public static void SentenceCase(String str){
        // The efficiency of this method can be improved
        //String[] arr = str.split(" ");
        String arr = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        
        //StringBuffer sb = new StringBuffer();
        //for(int i = 0; i < arr.length; i++) {
        //    sb.append(arr[i]);
        //    sb.append(" ");
        //}
        
        //String out = sb.toString();
        System.out.println(arr);
    }
    public static void RandomNumberTwo(int min, int max, int numberOf){
        // What if min > max ?
        // What if max is < 0;
        if(min < 0 || max <= 0 || numberOf <= 0 || min >= max) return;
        
        Random r = new Random();
        for (int i = 0; i < numberOf; i++) {
            int randomInt = r.nextInt(max) + min;
            System.out.println(randomInt);
        }
    }
    public static void RandomNumber(int min, int max){
        // What if min > max ?
        // What if max is < 0;
        
        if(min < 0 || max <= 0 || min >= max) return;
        
        Random r = new Random();
        int randomInt = r.nextInt(max) + min;
        System.out.println(randomInt);
    }
    public static void RollOfDice(){
        Random r = new Random();
        int randomInt = r.nextInt(6) + 1;
        System.out.println(randomInt);
    }
    public static void RollOfDiceCount(int numOfDie){
        Random r = new Random();
        for (int i = 0; i < numOfDie; i++) {
           int randomInt = r.nextInt(6) + 1;
            System.out.println(randomInt); 
        }
    }
    public static void GreatestNumber(int[] arr){
        // The efficiency of this method can be improved
        int temp = 0;
        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(i > j){
//                    temp = i;
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    System.out.println("I am in the loop");
//                }
//            }
//        }
        System.out.println(arr[arr.length-1]);
    }
    public static void SmallestNumber(int[] arr){
        // The efficiency of this method can be improved
        int temp = 0;
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    public static void mean(int[] arr){
        // Have you considered integer overflow conditions?
        long temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
        }
        double mean = (double) temp / arr.length;
        System.out.println(mean);
    }
}
