package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    /**Метод сортирует объекты по площади по возрастанию,
     * берет первые n элементов и возвращает строковые представления этих объектов в виде списка List.
     * Количество n элементов передаётся в метод buildApartmentsList() вторым параметром.*/
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        if (apartments.size() < count) {
            return new ArrayList<>();
        }
        List<Home> givenList = apartments.subList(0, count);
        List<String> output = givenList.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString)
                .toList();
        return output;
    }
}
// END
