public class task4 {
    public static void main(String[] args) {
        int[] x1 = new int[10];
        int[] x2 = new int[10];
        int[] x3 = new int[10];
        for (int i = 0; i < x1.length; i++){
            x1[i] = (int)(Math.random() * 10);
            x2[i] = (int)(Math.random() * 10);
            x3[i] = x1[i] + x2[i];
        }
        for (int j : x1) System.out.println(j);
        System.out.println();

        for (int j : x2) System.out.println(j);
        System.out.println();

        for (int j : x3) System.out.println(j);
        System.out.println();
    }
}
