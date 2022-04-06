import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of colors : ");
        MapColoringProblem.numberOfColors=sc.nextInt();
        MapColoringProblem.getMap();

    }
}
