package respons.strategy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/11/14
 */
public class DataSort {

    public static void sort(Object[] objects) {
        for (int i = objects.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Comparable c1 = (Comparable) objects[j];
                Comparable c2 = (Comparable) objects[j + 1];
                if (c1.compare(c2) > 0) {
                    swap(objects, j, j + 1);
                }
            }
        }
    }

    public static void print(Object[] objects) {
        for (Object o : objects) {
            System.out.print(o + " ");
        }
        System.out.println();
    }


    private static void swap(Object[] objects, int i, int j) {
        Object temp = objects[j];
        objects[j] = objects[i];
        objects[i] = temp;
    }
}
