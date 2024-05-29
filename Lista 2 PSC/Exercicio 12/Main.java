
public class Main {
    public static void main(String[] args) {
        System.out.println(lastNameOf("Joao Paulo"));
    }

    public static String lastNameOf(String name){
        return name.substring((name.lastIndexOf(" "))+1);
    }
}