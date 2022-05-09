public class task2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
            System.out.println(array[i]);
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if ((array[j] & 1) == 1) {
                array[j] = 0;
            }
            System.out.println(array[j]);
        }
    }
}
