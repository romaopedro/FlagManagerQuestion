
public class Main {
    public static void main(String[] args) {

        long start_time = System.nanoTime();
        final int ITERATIONS = 1000000000;

        for (int i = 0; i < ITERATIONS; i++) {
            FlagManager mCut = new FlagManager(false, false, false, false);

            mCut.areAllFlagsOff();
        }

        long end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e6;

        System.out.println("Difference in milliseconds: " + difference);
    }
}
