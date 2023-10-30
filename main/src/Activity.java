import java.util.Date;

public class Activity {
    private String name;
    private String description;
    private Date deadline;
    private boolean completed;

    public Activity(String name, String description, Date deadline, boolean completed) {
        // Constructor: Initializes an activity with a name, description, deadline, and completion status.
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
