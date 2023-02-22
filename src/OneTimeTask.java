import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends TaskMaster{
    public OneTimeTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        super(title,type,dateTime,description);
    } @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isEqual(getDateTime().toLocalDate()));
    }

    @Override
    public String toString() {
        return "Однодневная задача: " + super.toString();
    }
}
