package Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.random);
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.random);
    }
}