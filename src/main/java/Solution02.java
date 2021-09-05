/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input of string? ");
        String string = input.nextLine();
        int stringLength = string.length();
        System.out.printf(string + "has " + stringLength + " characters.");
    }
}
/*
    PseudoCode
    Get user input for string through standard input
    create an int variable
    call the length() function to get length of string
    make the int variable equal to the returned value of the length function
    print original string and length of string in standard output
 */