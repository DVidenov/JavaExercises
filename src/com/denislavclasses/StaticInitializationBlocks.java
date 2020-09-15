package com.denislavclasses;

import java.util.Scanner;

public class StaticInitializationBlocks {
    public static int B;
    public static int H;
    private static boolean flag;


    public static void main(String[] args) throws Exception {
        calculation();
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        else
            throw new Exception("Breadth and height must be positive");


    }//end of main
    public static void calculation(){
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B > 0 && H > 0){
            flag = true;
        }
    }

}//end of class
