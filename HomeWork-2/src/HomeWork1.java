import java.util.Arrays;
public class HomeWork1 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 0, 1};

        System.out.println(Arrays.toString(arr) + " - заданный массив");

        for(int i = 0; i < 10; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }

        System.out.println(Arrays.toString(arr) + " - полученный массив");
    }
}

