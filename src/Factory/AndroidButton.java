package Factory;

public class AndroidButton implements Button {
    @Override
    public void onClick() {
        System.out.println("AndroidButton clicked");
    }
}
