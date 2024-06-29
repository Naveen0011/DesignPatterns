public class Student {
    int id;
    String name;
    int rank;
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    Student(StudentBuilder s){
        this.id = s.id;
        this.name = s.name;
        this.rank = s.rank;
    }

}
