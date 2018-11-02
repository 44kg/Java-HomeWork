public class HomeWork5 {
    public static void main(String[] args) {

        int[] arr = {5, 116, 243, -10, 1, -22, 555, 24, 0, 10};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
