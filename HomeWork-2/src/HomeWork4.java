public class HomeWork4 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if((i == j) || (i + j == arr.length - 1)) {
                    arr[i][j] = 1;
                }
            }
        }

        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print (arr[i][j]);
            }
            System.out.println();
        }
    }
}
