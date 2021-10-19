package com.revature.atbash;

import java.util.Scanner;

public class atbash {

    //    Java: The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
    //    Create a function that takes a string and applies the Atbash cipher to it.

    //    Examples
    //    atbash("apple") --> "zkkov"
    //    atbash("Hello world!") --> "Svool dliow!"
    //    atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

    //    Notes:
    //    Capitalisation should be retained.
    //    Non-alphabetic characters should not be altered.
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.println("type exit to quit");
        System.out.println("Begin typing words to encrypt");
        String input = inputScan.nextLine();
        while(!input.equals("exit")){

            System.out.println(atbash(input));

            input = inputScan.nextLine();
        }
    }

    public static String atbash(String input){

        StringBuilder decode = new StringBuilder();

        for(int i =0; i < input.length(); i++){
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c))
                    decode.append((char)(('Z'-c)+'A'));
                else
                    decode.append((char)(('z'-c)+'a'));
            }
            else if(Character.isSpaceChar(c))
                decode.append(c);
        }
        return decode.toString();
    }

}
