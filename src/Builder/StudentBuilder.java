public class StudentBuilder {
    int id;
    String name;
    int rank;
    public Student build(){
         return new Student(this);
    }
    public StudentBuilder id(int id){
        this.id = id;
        return this;
    }
    public StudentBuilder name(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder name(int rank){
        this.rank = rank;
        return this;
    }

}
