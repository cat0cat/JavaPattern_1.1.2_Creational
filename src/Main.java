import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу значений: ");
        int highValue = scanner.nextInt();
        logger.log(("Создаем и наполняем список"));
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            randomList.add(random.nextInt(highValue));
        }
        System.out.println("Вот случайный список: " + randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int filterThreshhold = scanner.nextInt();
        Filter filter = new Filter(filterThreshhold);
        List<Integer> filteredList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        System.out.println("Завершаем программу");
    }
}
