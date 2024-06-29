//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.random);
        Student student = Student.getBuilder().id(1).name("name").name(1).build();
        Student student1 = Student.getBuilder().id(2).name("name1").name(2).build();
        System.out.println(student.id);
        System.out.println(student1.id);

    }
}