import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[]  unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i])
            }
        }

        return sortedArray;
    }
}