import java.util.Scanner;

public class Opg5_46 {
    public static void main(String[] args) {

        //Her scannes en string
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en string");
        String indtastet = input.nextLine();

        //Her initialiseres den string som skal spyttes ud til sidst
        String output="";

        //Denne integer opmåler længden af den indtastede string
        int lengthOfString=indtastet.length()-1;

        //Dette loop starter fra slutningen af og lægger hvert enkelt bogstav over i en temp der så concatineres med
        //den string som til sidst bliver udskrevet
        for (int i=lengthOfString; i>=0; i--){
            String temp = indtastet.substring(i,i+1);
            output += temp;
        }

        System.out.println(output);

    }
}
