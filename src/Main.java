import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IncorrectArgumentException {
        OneTimeTask boris = new OneTimeTask("Однодневная задача", Type.WORK, LocalDateTime.of(2023, 02, 22, 18, 01), "Постараться закончить курсовую");
        MonthlyTask fransua = new MonthlyTask("Ежемесячная задача", Type.WORK, LocalDateTime.of(2023, 02, 22, 18, 02), "Долго тупить");
        DailyTask elena = new DailyTask("Ежедневная задача", Type.PERSONAL, LocalDateTime.of(2023, 02, 22, 18, 03), "Попить чай");
        YearlyTask vova = new YearlyTask("Ежегодная задача", Type.PERSONAL, LocalDateTime.of(2023, 02, 22, 18, 04), "Постараться выиграть Major");
        WeeklyTask petr = new WeeklyTask(" Задача еженедельная ", Type.WORK, LocalDateTime.of(2023, 02, 22, 18, 05), "Сводить жену на свидание");
        System.out.println(elena.toString());
        System.out.println(boris.toString());
        System.out.println(petr.toString());
        System.out.println(fransua.toString());
        System.out.println(vova.toString());
        List<TaskMaster> tL;
        tL = new LinkedList<>();
        tL.add(vova);
        tL.add(elena);
        tL.add(boris);
        tL.add(fransua);
        System.out.println(" Список задач: " + tL);
        Map<Integer, TaskMaster> taskMap = new HashMap<>();
        taskMap.put(1, elena);
        taskMap.put(2, vova);
        taskMap.put(3, fransua);
        taskMap.put(4, boris);
        taskMap.put(5, petr);
        taskMap.remove(3);
        System.out.println("Вывод"+ taskMap);

    //Задача на функ.программирование
        System.out.println();
     System.out.println("ТЕКСТ: yourapp the quick brown fox jumps over the lazy dog");
    String input = "yourapp the quick brown fox jumps over the lazy dog";
        System.out.println(" СОРТИРОВКА ");
    String[] words = input.split("\\s+");
        Arrays.sort(words);
    Map<String, Integer> w = new LinkedHashMap<>(10);
        for (String element : words) {
        if (w.containsKey(element)) {
            w.put(element, w.get(element) + 1);
        } else {
            w.put(element, 1);
        }
    }
    Map<String, Integer> sortedMap = w.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> -e.getValue()))
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (a, b) -> {
                        throw new AssertionError();
                    },
                    LinkedHashMap::new
            ));
        System.out.println("ВЫВОД: В тексте " + w.size() + " слов ");
        System.out.println(" TOP 10: ");
        for (Map.Entry<String, Integer> element : sortedMap.entrySet()) {
        System.out.println(element.getValue() + " " + element.getKey());
    }
}

}