import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class TaskMaster {
    private static int idGenerator = 1;
    private String title;
    private Type type;
    private int id;
    private LocalDateTime dateTime;
    private String description;

    public TaskMaster(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException{
        setTitle(title);
        setDescription(description);
        this.type = type;
        this.dateTime = dateTime;
        this.id = idGenerator++;
    }


    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) throws IncorrectArgumentException {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new IncorrectArgumentException("Значение заголовка некорректно");
        } else {
            this.title = title;
        }
    }

    public void setDescription(String description) throws IncorrectArgumentException {
        if (description == null || description.isEmpty() || description.isBlank()) {
            throw new IncorrectArgumentException("Значение описания некорректно");
        } else {
            this.description = description;
        }
    }

    public abstract boolean appearsln(LocalDate dateForChecking);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskMaster task = (TaskMaster) o;
        return id == task.id && title.equals(task.title) && type == task.type && dateTime.equals(task.dateTime) && description.equals(task.description);
    }

        @Override
        public int hashCode() {
            return Objects.hash(title, type, id, dateTime, description);
    }
    @Override
    public  String toString(){
        return "Задача: "+"ID: "+id+" Заголовок: "+title+" тип: "+type+" время: "+dateTime+" описание: "+description;
    }
}
