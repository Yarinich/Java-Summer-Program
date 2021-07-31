import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class workWithIntStream {

        private static int[] array = new int[]{1, 3, 4, -9, -10, -298, 17, 80003, 0, 345, -68, 100};
        private static final int MULTIPLIER = 2;

        public static void main(String[] args) {

            double average = findAverageOfArrayElements(getIntStream());
            int minElementValue = findValueForMinElement(getIntStream());
            int minElementIndex = findIndexForMinElement();
            long zeroCounter = findQuantityOfElementsEqualToZero(getIntStream());
            long biggerThanZeroCounter = findQuantityOfElementsBiggerThanZero(getIntStream());
            int [] multipliedArray = multiplyArrayElementsByNumber(getIntStream(), MULTIPLIER);

            System.out.println("Average: " + average);
            System.out.println("Minimum element value: " + minElementValue);
            System.out.println("Minimum element index: " + minElementIndex);
            System.out.println("Number of zero's in array: " + zeroCounter);
            System.out.println("Number of positive elements: " + biggerThanZeroCounter);
            System.out.println("Array, multiplied by " + MULTIPLIER + ":");
            Arrays.stream(multipliedArray).forEach(value -> System.out.print(value + " "));

        }

        public static double findAverageOfArrayElements(IntStream intStream) {
            return intStream.average().orElse(0.0);
        }

        public static int findValueForMinElement(IntStream intStream) {
            return intStream.min().orElseThrow(NoSuchElementException::new);
        }

        public static int findIndexForMinElement() {
            return IntStream.range(0, array.length)
                    .reduce(((left, right) -> array[left] < array[right] ? left : right))
                    .orElseThrow(NoSuchElementException::new);
        }

        public static long findQuantityOfElementsEqualToZero(IntStream intStream) {
            return intStream.filter(value -> value == 0).count();
        }

        public static long findQuantityOfElementsBiggerThanZero(IntStream intStream) {
            return intStream.filter(value -> value > 0).count();
        }

        public static int [] multiplyArrayElementsByNumber(IntStream intStream, int number) {
            return intStream.map(value -> value * number).toArray();
        }

        private static IntStream getIntStream(){
            return Arrays.stream(array.clone());
        }
}
