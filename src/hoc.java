// Replace ___ with your code
import java.util.Scanner;

class hoc {
    public static void main(String[] args) {

        // array to store height
        double[] heights = new double[11];

        // get input for heights
        Scanner input = new Scanner(System.in);
        int i;
        for (i = 0; i < heights.length; ++i) {
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;

        // find the sum of all the heights
        sum = sum + heights[i];

        // find the mean height and print it
        double mean = sum / 11;
        System.out.println(mean);

        input.close();
    }
}
