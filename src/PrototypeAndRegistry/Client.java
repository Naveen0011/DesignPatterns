package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Triber grey_2021 = new Triber("Grey",2021);
        Triber red_2021 = grey_2021.clone();
        TriberRMZ greyRmz_2021 = new TriberRMZ("Grey",2021,"waves");
        TriberRMZ redRmz_2021 = greyRmz_2021.clone();
        redRmz_2021.setColor("red");
        redRmz_2021.setDesign("fire");
        red_2021.setColor("red");
        System.out.println("Without Registry Triber: " + grey_2021.getColor());
        System.out.println("Without Registry Triber: " + red_2021.getColor());
        System.out.println("Without Registry TriberRmz: " + greyRmz_2021.getColor());
        System.out.println("Without Registry TriberRmz: " + redRmz_2021.getColor());
        System.out.println("Without Registry TriberRmz: " + greyRmz_2021.getDesign());
        System.out.println("Without Registry TriberRmz: " + redRmz_2021.getDesign());

        TriberRegistry registry = new TriberRegistry();
        registry.register("grey_2021",grey_2021);
        registry.register("greyRmz_2021",greyRmz_2021);
        Triber blue_2021 = registry.getObject("grey_2021");
        blue_2021.setColor("blue");
        TriberRMZ blueRmz_2021 = (TriberRMZ) registry.getObject("greyRmz_2021");
        blueRmz_2021.setColor("blue");
        blueRmz_2021.setDesign("shower");
        System.out.println("With Registry Triber: " + blue_2021.getColor());
        System.out.println("With Registry TriberRmz: " + blueRmz_2021.getColor());
        System.out.println("With Registry TriberRmz: " + blueRmz_2021.getDesign());

    }
}
