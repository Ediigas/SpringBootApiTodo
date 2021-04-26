package Web;

import DoMain.TodoAppItem;
import Service.TodoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class TodoAppController {
    @Autowired
    private TodoAppService todoAppService;

    public TodoAppController(TodoAppService todoAppService) {
        this.todoAppService = todoAppService;
    }

    @GetMapping("/api/todoAppItems")
    public ResponseEntity<?> fetchAllTodoItems () {
        List<TodoAppItem> todoAppItems = todoAppService.fetchAllTodoItems();

        return ResponseEntity.ok(todoAppItems);
    }
}
