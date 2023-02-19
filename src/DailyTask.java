import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends TaskMaster{
    public DailyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        super(title,type,dateTime,description);
    }

    @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()));
    }

    @Override
    public String toString() {
        return "Ежедневная задача: " + super.toString();
    }
}
