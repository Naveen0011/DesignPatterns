package PrototypeAndRegistry;

public class TriberRMZ extends Triber {

    String design;

    TriberRMZ(String color, Integer year,String design) {
        super(color, year);
        this.design = design;
    }

    TriberRMZ(TriberRMZ z) {
        super(z.color, z.year);
        this.design = z.design;
    }

    @Override
    public TriberRMZ clone() {
        return new TriberRMZ(this);
    }

    public String getDesign() {
        return this.design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

}
