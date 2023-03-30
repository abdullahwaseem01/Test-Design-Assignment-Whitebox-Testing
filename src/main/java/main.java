import java.lang.reflect.Array;

public class main {
    public static int countOccurrences(char[] arr, char c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'a', 'e'};
        char c = 'a';
        int count = countOccurrences(arr, c);
        System.out.println("The charecter " + c + " occurs " + count + " times in the array");
    }
}