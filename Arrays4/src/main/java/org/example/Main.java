package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak

 */

public class Main {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom Karakter giriniz: ");//eyedipadanadapideye
        String word= input.nextLine();
        if (isPalindrom(word)){
            System.out.println(word+" Palindrom kelime");
        }else {
            System.out.println(word+" Palindrom kelime degil");

        }


    }

    static  boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return true;

}}