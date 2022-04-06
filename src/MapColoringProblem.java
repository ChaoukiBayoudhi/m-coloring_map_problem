import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MapColoringProblem {
    public static int numberOfColors;
    public static List<String> listOfColors = new ArrayList<String>();
    public static List<List<Integer>> map=new ArrayList<>();
    //get the matrix describing the map (matrix of zeros and ones)
    public static void getMap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of map's zones : " );
        int nbZones=sc.nextInt();
        System.out.println("Introduce a sequence of "+nbZones+
                " 0/1 fro each zone.\n'1' in the i-th  position if there is "+
                "a frontier with the i-th zone.\nIntroduce 0 if not");
        for (int i = 0; i < nbZones; i++) {
            String sequence;
            do {
                System.out.println("Sequence describing frontiers for zone " + (i + 1));
                sequence = sc.next();
            }while(sequence.length()!=nbZones);
            List<Integer> borders=new ArrayList<>();
            for (int j = 0; j < sequence.length(); j++) {
                borders.add(sequence.charAt(j)-'0');
            }
            borders.set(i,0);
            map.add(borders);
        }
        System.out.println("The introduced map :");
        showList(Collections.singletonList(map));
    }
    public static void generateMap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of map's zones : " );
        int nbZones=sc.nextInt();
    }
    //show all possibilities to color the graph
    public static void showList(List<List<?>> lst)
    {
        System.out.println("[");
        for(List<?> x : lst)
            System.out.println(x.toString());
        System.out.println("]");
    }
    //verify if a sequence of given colors is valid or not
    //returns true if valid
    //false if not
    public static boolean isValid(List<Character> colorsSequence)
    {
        boolean ok=true;

        return ok;
    }
    public List<List<Character>> MapColoring()
    {
        List<List<Character>> result =new ArrayList<>();
        solveMapColoring(new ArrayList<Character>(),result);
        return result;
    }
    //loop all combinitions to find all possibles solutions
    public static void solveMapColoring(List<Character> colorsSequence, List<List<Character>> result)
    {

    }

}
