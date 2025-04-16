
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author truon
 */
public class Slot01_a {

    public static void main(String[] args) {
        int n = 3;
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Input a["+i+"]=");
            } catch (Exception e) {
            }
            System.out.println(array);//in ra dia chi bien
//            System.out.println("\n---");
//            for (int i = 0; i < 10; i++) {
//                array[i] = 1;
//            }
//            for (int i = 0; i < 10; i++) {
//                System.out.println(array[i]+"");
//            }
             System.out.println("\n-----");
             for (int j : array) {
                i = 1;
            }
             for (int j : array) {
                 System.out.println(i+"");
            }
             System.out.println("so luong :" + array.length);
             String str = "Chao mung ban quay tro lai voi cas201";
             System.out.println(str.length());
        }
    }
}
