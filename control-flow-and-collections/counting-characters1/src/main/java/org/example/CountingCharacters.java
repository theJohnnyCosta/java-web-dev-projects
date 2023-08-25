package org.example;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String [] args) {
        String characterCounter = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there." ;

        char[] charactersInString = characterCounter.toCharArray();
        HashMap<Character, Integer> charactersMap = new HashMap<>();

        for(char character : charactersInString) {
            System.out.println(character);
        }
    }
}
