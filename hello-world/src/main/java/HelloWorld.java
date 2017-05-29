public class HelloWorld {
    public static String hello(String name) {
        String string = isBlank(name) ? "World" : name;
        return "Hello, " + string + "!";
                
    }
    
    private static boolean isBlank(String name){
        return name == null || "".equals(name);
    }
}
