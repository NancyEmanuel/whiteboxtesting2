package com.ontariotechu.sofe3980U;

public class CharacterOccurences {
    
    public static int countOccurrences(char[] ArrayInput, char match) {

    int count = 0;


        for (char i : ArrayInput) {
            
            if (i == match){
                count++;}

                
        }


        System.out.println("Number of character occurrences of '" + match + "'is " + count);
        return count;

   
    }

}





