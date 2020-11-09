import java.util.*;
public class App {

    private static void findLocation(String userInput){
        boolean found = false;
        String[] alps = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println(alps[i]+nums[j]);
                System.out.println(userInput);
                if((alps[i]+nums[j]).equals(userInput)){
                    System.out.println(userInput + " location found!");
                    found = true;
                    break;
                }
            }
            if(found) break;
        }


        if(!found) System.out.println(userInput+" location not found!");
    }



    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.print("Grid Location:\t");
        String userInput = scan.next();
        findLocation(userInput);


        


        
        
    }
}
