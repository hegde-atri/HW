import java.util.*; 
import java.lang.reflect.Array;  

public class sortingHW {

    public static void intSorter(int[] list){
        boolean sorted = false;
        int highest=0;
        int counter =0;
        while(sorted==false){
            int previousHighest = highest;
            for(int i=0; i<list.length; i++){
                highest = list[i];
                if( i > (i+1)){
                    int lowerNumber = list[i+1];
                    list[i] = list[i+1];
                    list[i] = lowerNumber;
                }

            }
            if(previousHighest == highest){
                counter++;
                if(counter<1){
                    sorted = true;
                }
            }

        }
    }

    public static void arrayPrinter(int[]list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+",");
            int spacer = 0;
            if (spacer !=0) System.out.println(" ");
            spacer++;
        }
    }


    public static void main(String[]args){
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you wanna sort-\t");
        int arrayLength = scan.nextInt();
        int numsToSort[] = new int[arrayLength];
        for(int x=0; x<arrayLength; x++){
            System.out.print("enter the number - \t");
            temp = scan.nextInt();
            numsToSort[x] = temp;
            
        }
         
        intSorter(numsToSort);
        arrayPrinter(numsToSort);


        



    }

}