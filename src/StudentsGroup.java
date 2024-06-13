import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student groupLeader;
    private List<Student> students;
    private List<String> tasks;

    public StudentsGroup(Student groupLeader) {
        if (groupLeader == null) {
            throw new IllegalArgumentException("Group leader cannot be null.");
        }
        this.groupLeader = groupLeader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void changeGroupLeader(Student newLeader) {
        if (newLeader == null) {
            throw new IllegalArgumentException("New group leader cannot be null.");
        }
        this.groupLeader = newLeader;
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void markTaskCompleted(Student student, int taskIndex) {
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        if (groupLeader == null) {
            throw new IllegalArgumentException("Group leader cannot be null.");
        }
        this.groupLeader = groupLeader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}
