import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends TaskMaster{
    public MonthlyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        super(title,type,dateTime,description);
} @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()) && dateForChecking.getDayOfMonth() == getDateTime().getDayOfMonth());
    }

    @Override
    public String toString() {
        return "Ежемесячная задача: " + super.toString();
    }
}
