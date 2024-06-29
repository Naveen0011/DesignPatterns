public class Singleton {
    private static Singleton myObj;
    public Double random;
    public static synchronized Singleton getInstance(){
        if(myObj == null){
            myObj = new Singleton();
            myObj.random = Math.random();
            return myObj;
        }
        return myObj;
    }
}
