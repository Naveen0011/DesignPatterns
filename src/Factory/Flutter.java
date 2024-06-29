package Factory;

public class Flutter{
    public void setTheme(){
        System.out.println("Theme is set in the text book");
    }
    public void setColor(){
        System.out.println("Color is set in the text book");
    }
    public UIfactory getUIFactory(PlatformEnum data){
        if(data.equals(PlatformEnum.ANDROID)){
            return new AndriodFactory();
        }
        if(data.equals(PlatformEnum.IOS)){
            return new IOSFactory();
        }
        return null;
    }
}