public class Main {
    public static void main(String[] args) {
        Student leader = new Student(1, "Jan", "Kowalski");
        Student student1 = new Student(2, "Max", "Mustermann");

        StudentsGroup group = new StudentsGroup(leader);
        group.addStudent(student1);

        group.addTask("Learn encapsulation");
        group.markTaskCompleted(student1, 0);

        System.out.println("Leader: " + group.getGroupLeader().getFirstName() + " " + group.getGroupLeader().getLastName());
        System.out.println("Students: ");
        for (Student student : group.getStudents()) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("Tasks: ");
        for (String task : group.getTasks()) {
            System.out.println("- " + task);
        }
    }
}
