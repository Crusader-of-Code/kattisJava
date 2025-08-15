import java.util.Scanner;

public class jumbojavelin {

        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            int numberOfJavelins = myScanner.nextInt();

            int currentRod = myScanner.nextInt();
            int totalLength = currentRod;

            for (int i = 1; i < numberOfJavelins ; i++) {
                currentRod = myScanner.nextInt();
                totalLength += currentRod;
                totalLength = totalLength - 1;

            }
            System.out.println(totalLength);
        }

}
