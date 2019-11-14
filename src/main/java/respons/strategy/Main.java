package respons.strategy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/11/14
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {4,5,6,3,2,7,81,23,45,6,2,1};
        sort(array);
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
