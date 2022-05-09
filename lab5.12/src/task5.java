public class task5 {
    public static void main(String[] args) {
        int [] x = new
                int[15];
        int y = 0;
        for (int i = 0; i < x.length; i++){
            x[i] = (int)(Math.random() * 10);
            if (x[i] % 2 == 0)
                y += 1;
            System.out.println(x[i]);
        }
        System.out.println();
        System.out.println("y=" + y);
    }
}
