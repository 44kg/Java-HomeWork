import java.util.Arrays;
public class HomeWork2 {
    public static void main(String[] args) {

        int[] arr = new int[8];

        int x = 0;

        for(int i = 0; i < 8; i++) {
            arr[i] = x;
            x += 3;
        }

        System.out.println(Arrays.toString(arr));

    }
}
