public class Opg5_5 {
    public static void main(String[] args) {

        final double POUNDS_PER_KG = 2.2;

        System.out.println("Kilograms\tPounds\t\t|\t\tPounds\tKilograms");
        for (int i = 1, j = 20; i <= 200 && j <= 515; i+=2, j+=5) {

            System.out.printf("%-11d%7.1f", i, (i * POUNDS_PER_KG));
            System.out.printf("\t\t|\t\t");
            System.out.printf("%-7d%10.2f%n", j, (j / POUNDS_PER_KG));

        }
    }
}