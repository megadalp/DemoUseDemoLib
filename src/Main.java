import org.dalp.demolib.LibOne;

public class Main {
    public static void main(String[] args) {

        System.out.println("Из нашей библиотеки:\n");
        System.out.println(new LibOne().methodOne());
        System.out.println("\n");
        LibOne.methodTwo();
    }
}