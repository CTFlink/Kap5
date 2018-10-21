import java.util.Scanner;

public class Opg5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Her bedes brugeren om at taste en række int
        System.out.print("Enter a number of integers seperated by 'Enter', the input ends if the input is 0: ");

        int positive = 0;
        int negative = 0;
        double count = 0;
        double total = 0;

        int number = input.nextByte();

        if (number == 0){
            System.out.println("No numbers are entered except 0\n");
            System.exit(0);
        }

        while (number != 0){

            if (number > 0) positive++;
            if (number < 0) negative++;
            total += number;
            count++;

            number = input.nextByte();


        }

        double avg = total / count;

        System.out.println(
                "The number of positive is " + positive +
                        "\nThe number of negatives is " + negative +
                        "\nThe total is total " + total +
                        "\nThe average is " + avg);

    }
}