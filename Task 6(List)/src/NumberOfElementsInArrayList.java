import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfElementsInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list =
                Stream.of(1, 2, 3, 1, 2, 3, 4, 5, 0, -1, -2, -3, -1).collect(Collectors.toCollection(ArrayList::new));

        Map<Integer, Long> resultStreamAPI = getElementsNumberStreamAPI(list);
        Map<Integer, Integer> resultLoop = getElementsNumberIterative(list);

        System.out.println("Result using StreamAPI: ");
        resultStreamAPI.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println("Result using Loop: ");
        resultLoop.forEach((key, value) -> System.out.println(key + " - " + value));

    }

    /**
     * Рахуємо кількість кожного елемента list і записуємо це в map
     * (key - елемент list, value - кількість елемента в list)
     * @param list
     * @return
     */
    public static Map<Integer, Integer> getElementsNumberIterative(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list) {
            Integer element = map.get(key);
            if (element == null) {
                map.put(key, 1);
            } else {
                map.replace(key, ++element);
            }
        }
        return map;
    }

    /**
     * Групуємо ідентичні елементи list з їх кількістю в list
     * @param list
     * @return
     */
    public static Map<Integer, Long> getElementsNumberStreamAPI(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
