package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DoMain.TodoAppItem;
import Repository.TodoAppRepository;


@Service
public class TodoAppService {

    @Autowired
    private TodoAppRepository  todoAppRepo;

    public TodoAppService(TodoAppRepository todoAppRepo) {
        this.todoAppRepo = todoAppRepo;
    }

    public List<TodoAppItem>fetchAllTodoItems() {
        return todoAppRepo.fetchAllTodoItems();
    }

}
