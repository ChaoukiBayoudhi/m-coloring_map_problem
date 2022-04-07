import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of colors : ");
        MapColoringProblem.numberOfColors=sc.nextInt();
        System.out.println("Enter the list of colors :");
        MapColoringProblem.getListOfColors();
        MapColoringProblem.getMap();
       // MapColoringProblem.generateMap();

        MapColoringProblem.showList(Collections.singletonList(MapColoringProblem.mapColoring()));

    }
}
