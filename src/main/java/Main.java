import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        final int ITERATIONS = 10000000;

        int value = 20;
        double sum = 0;

        for (int i = 0; i < value; i++) {
            sum += getPerformanceOf(ITERATIONS);

        }
        double average = sum / value;
        DecimalFormat df = new DecimalFormat("###.###");

        System.out.println("Running 10 million times took: " + df.format(average) + " milliseconds");
    }

    private static double getPerformanceOf(int ITERATIONS) {
        long start_time = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            FlagManager mCut = new FlagManager(i % 2 != 0, i % 3 != 0, i % 4 != 0, i % 2 != 1);

            mCut.areAllFlagsOff();
        }

        long end_time = System.nanoTime();
        return (end_time - start_time) / 1e6;
    }
}
