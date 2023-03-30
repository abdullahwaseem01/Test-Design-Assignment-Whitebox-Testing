import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    @Test
    public void NodeCoverageTestPath1(){
        char [] arr = {'a', 'b', 'c', 'd'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void EdgeCoverageTestPath1(){
        char [] arr = {};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    @Test
    public void EdgeCoverageTestPath2(){
        char [] arr = {'a'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void EdgeCoverageTestPath3(){
        char [] arr = {'a', 'b', 'b'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }

    @Test
    public void EdgePairCoverageTestPath1(){
        char [] arr = {'a'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void EdgePairCoverageTestPath2(){
        char [] arr = {'c', 'd'};
        char c = 'c';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void EdgePairCoverageTestPath3(){
        char [] arr = {'d', 'c'};
        char c = 'c';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void EdgePairCoverageTestPath4(){
        char [] arr = {};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(0, output);
    }

    @Test
    public void PrimePathsTestPath1(){
        char [] arr = {};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    @Test
    public void PrimePathsTestPath2(){
        char [] arr = {'a', 'b', 'a'};
        char c = 'b';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    @Test
    public void PrimePathsTestPath3(){
        char [] arr = {'a', 'a'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(2, output);
    }
    @Test
    public void PrimePathsTestPath4(){
        char [] arr = {'b', 'b'};
        char c = 'a';
        int output = main.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    @Test
    public void PrimePathsTestPath5(){
        char [] arr = {'c'};
        char c = 'c';
        int output = main.countOccurrences(arr, c);
        assertEquals(1, output);
    }

}
