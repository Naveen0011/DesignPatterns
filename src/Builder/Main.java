package Builder;

public class Main {
    public static void main(String args[]){
        Student s = Student.getBuilder().build();
        System.out.println(s.id);
    }
}