package com.company;

/*

0722 This is the end

Create a list of strings.
Enter lines from the keyboard and add them to the list.
Enter strings from the keyboard until the user enters the string "end". Do not consider the string "end" itself.
Display lines on the screen, each with a new line.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. Read lines from the keyboard and add them to the list until the user enters the string "end".
3. The string "end" itself does not need to be added to the list.
4. Display the list, each value from a new line.
5. Use the for loop.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        do {
            list.add(reader.readLine());
        } while (!list.get(list.size()-1).equals("end"));
        list.remove(list.size()-1);
        for(String str : list) {
            System.out.println(str);
        }
    }
}








