public class Opg5_10 {

    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;


        System.out.println("Tallene  mellem 100 og 1000, der kan divideres med både 5 og 6,  er flg.:");
        int count = 0;
        for (int i = 100; i < 1000 ; i++) {
            if (i % 5 == 0 && i % 6 == 0){
                count++;
                if (count % 10 == 0){
                    System.out.println(i);
                }
                else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
