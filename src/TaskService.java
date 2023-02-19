import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TaskService {
    private Map<Integer, TaskMaster> taskMap = new HashMap<>();
    private List<TaskMaster> removedTasks = new LinkedList<>();
    public void add(TaskMaster task){
        taskMap.put(task.getId(), task);
    }
    public TaskMaster remove(int id) throws TaskNotFoundException {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException("Нет такого ID задачи");
        }return taskMap.remove(id);
    }

    public List<TaskMaster> getAllByDate(LocalDate dateForChecking) {
        List<TaskMaster> taskListAllByDate = new LinkedList<>();
        for (Map.Entry<Integer, TaskMaster> entry : taskMap.entrySet()) {
            if (entry.getValue().appearsln(dateForChecking)) {
                taskListAllByDate.add(entry.getValue());
            }
        }return taskListAllByDate;
    }
    @Override
    public String toString() {
        return "TaskService" + " TaskMap " + taskMap+" RemovedTasks "+removedTasks;
    }
}
