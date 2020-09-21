package com.denislavclasses;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class IsPrimaryNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();

        scanner.close();
        boolean result;
        result = n.isProbablePrime(1);
        if (result == true) {
            System.out.println("prime");
        }
        else
            System.out.println("not prime");

    }
}
