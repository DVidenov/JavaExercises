package com.denislavclasses;

import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalComparison {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                BigDecimal o1bd = new BigDecimal(o1);
                BigDecimal o2bd = new BigDecimal(o2);
                return o2bd.compareTo(o1bd);
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
