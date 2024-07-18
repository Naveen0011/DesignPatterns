package Builder;

public class Main {
    public static void main(String args[]){
        Student s = Student.getBuilder().id(1).name("Kohli").build();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}