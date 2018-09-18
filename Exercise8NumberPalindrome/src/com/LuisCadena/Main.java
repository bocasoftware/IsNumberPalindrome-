package com.LuisCadena;

public class Main {

    public static void main(String[] args) {
    isPalindrome(123321);

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;


        while(palindrome != 0) {
            //Store the last digit of the number.
            int lastDigit = palindrome % 10;
            //System.out.println(lastDigit);

            //Store the reverse number.
            reverse = reverse * 10 + lastDigit;
            //System.out.println(reverse);

            //Remove the previous digit so that the last digit statement is correct.
            palindrome = palindrome / 10;
            //System.out.println(palindrome);

        }

        if (number == reverse) {
            System.out.println(number + " is a palindrome. ");
            return true;
        }else{
            System.out.println(number + " is NOT a palindrome.");return false;}












    }




}
