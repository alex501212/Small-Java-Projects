package the_string_analyser;
import java.util.Scanner;

public class The_String_Analyser {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scan.nextLine();
        
        String strip = input.replaceAll("\\W", "").replaceAll("\\d", "");
        
        char[] stripped = strip.toCharArray();
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] frq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (char i : stripped){
            for(int e = 0; e<letters.length; e++){
                if(letters[e]==i){
                    frq[e] ++;
                }
            }
        }
        for(int x = 0; x<letters.length; x++){
            System.out.println(letters[x] + " Occurred: " + frq[x] + " Times in This String.");
        }
            
    }
    
}
