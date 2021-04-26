package DoMain;

public class TodoAppItem {
    private Integer id;
    private String task;
    private  Boolean completedTask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(Boolean completedTask) {
        this.completedTask = completedTask;
    }
}

