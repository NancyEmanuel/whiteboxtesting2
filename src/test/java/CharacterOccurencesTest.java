package com.ontariotechu.sofe3980U;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterOccurencesTest {

    @Test // tests character c occurence in a array
    public void Test1() {
        char[] ArrayInput = {'c', 'c', 'b', 'a', 'a', 'c'};
        assertEquals(3, CharacterOccurences.countOccurrences(ArrayInput, 'c'));
    }

    @Test
    public void Test2() { // tests character b occurence in a array
      
        char[] ArrayInput = {'b', 'a', 'd', 'j', };
        assertEquals(1, CharacterOccurences.countOccurrences(ArrayInput, 'b'));
        }

    @Test // tests empty array
    public void Test3() {
        char[] ArrayInput = {};
        assertEquals(0, CharacterOccurences.countOccurrences(ArrayInput, 'c'));
            }

    @Test
    public void Test4() { // tests character a occurence in a array
     
        char[] ArrayInput = {'a', 'c', 'a', 'e', 'f'};
        assertEquals(2, CharacterOccurences.countOccurrences(ArrayInput, 'a'));
    }

    @Test
    public void Test5() { // tests character b occurence in a array
     
        char[] ArrayInput = {'a', 'c', 'b', 'e', 'f'};
         assertTrue(CharacterOccurences.countOccurrences(ArrayInput, 'b') >=1);
    }

    @Test
    public void Test6() { // tests character b occurence in a array
     
        char[] ArrayInput = {'a', 'c', 'f', 'e', 'f'};
         assertTrue(CharacterOccurences.countOccurrences(ArrayInput, 'b') <= 0);
    }
  
  

}
