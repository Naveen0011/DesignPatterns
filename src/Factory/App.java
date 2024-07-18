package Factory;

public class App {
    public static void main(String[] args){
        Flutter f = new Flutter();
        UIfactory androidFactory = f.getUIFactory(PlatformEnum.ANDROID);
        Button androidButton = androidFactory.createButton();
        androidButton.onClick();
        UIfactory iosFactory = f.getUIFactory(PlatformEnum.IOS);
        Button iosButton = iosFactory.createButton();
        iosButton.onClick();
    }
}
