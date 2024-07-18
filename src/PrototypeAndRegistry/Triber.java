package PrototypeAndRegistry;

public class Triber implements Prototype<Triber>{
    public String color;
    public Integer year;

    Triber(String color,Integer year){
        this.year = year;
        this.color = color;
    }

    public Triber(Triber copy) {
        this.year = copy.year;
        this.color = copy.color;
    }

    @Override
    public Triber clone() {
        return new Triber(this);
    }

    public String getColor(){
        return this.color;
    }

    public Integer getYear(){
        return this.year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(Integer year){
        this.year = year;
    }
}
