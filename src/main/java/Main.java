
public class Main {
    public static void main(String[] args) {

        long start_time = System.nanoTime();
        final int ITERATIONS = 1000000000;

        for (int i = 0; i < ITERATIONS; i++) {
            FlagManager mCut = new FlagManager(i % 2 != 0, i % 3 != 0, i % 4 != 0, i % 2 != 1);

            mCut.areAllFlagsOff();
        }

        long end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e6;

        System.out.println("Running 1 million times: " + difference);
    }
}
