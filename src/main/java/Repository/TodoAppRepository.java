package Repository;

import DoMain.TodoAppItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoAppRepository {
    private Integer idCounter = 0;
    private List<TodoAppItem> todoAppItems = new ArrayList<>();

    public List<TodoAppItem> fetchAllTodoItems() {
        if (todoAppItems.size() == 0) {
            TodoAppItem item1 = new TodoAppItem();
            item1.setId(idCounter++);
            item1.setCompletedTask(false);
            item1.setTask("Task #1");

            todoAppItems.add(item1);
        }
        return todoAppItems;

    }

}
