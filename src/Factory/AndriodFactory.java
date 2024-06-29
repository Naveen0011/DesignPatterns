package Factory;

public class AndriodFactory implements UIfactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
