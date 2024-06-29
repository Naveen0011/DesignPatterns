package Factory;

public enum PlatformEnum {
    ANDROID("ANDROID"),IOS("IOS");
    public String value;
    PlatformEnum(String value) {
        this.value = value;
    }
}
