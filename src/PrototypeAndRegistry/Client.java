package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Triber grey_2021 = new Triber("Grey",2021);
        Triber red_2021 = grey_2021.clone();
        red_2021.setColor("red");
        System.out.println(grey_2021.getColor());
        System.out.println(red_2021.getColor());
    }
}
