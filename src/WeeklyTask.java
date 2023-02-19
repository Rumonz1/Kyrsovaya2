import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends TaskMaster {
    public WeeklyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        super(title,type,dateTime,description);
    } @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()) && dateForChecking.getDayOfWeek() == getDateTime().getDayOfWeek());
    }

    @Override
    public String toString() {
        return "Еженедельная задача: " + super.toString();
    }
}
