package Factory;

public class IOSFactory implements UIfactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
