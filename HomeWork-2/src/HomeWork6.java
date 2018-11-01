public class HomeWork6 {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};

        System.out.println(checkBalance(arr1));
        System.out.println(checkBalance(arr2));
    }

    public static boolean checkBalance(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int x = 0;
            int y = 0;
            for(int a = 0; a <= i; a++) {
                x = x + arr[a];                         // Считаем сумму элементов до элемента i включительно
            }
            for(int b = i + 1; b < arr.length; b++) {
                y = y + arr[b];                         // Считаем сумму элементов после элемента i
            }
            if(x == y) {
                return true;                            // Если суммы равны возвращаем true, если нет продолжаем цикл.
            }
        }
        return false;
    }
}
