import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends  TaskMaster{
    public YearlyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        super(title,type,dateTime,description);
    } @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()) && dateForChecking.getDayOfYear() == getDateTime().getDayOfYear());
    }

    @Override
    public String toString() {
        return "Ежегодная задача: " + super.toString();
    }
}
