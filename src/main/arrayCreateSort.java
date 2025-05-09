import java.util.Scanner;
import java.util.Arrays;


public class arrayCreateSort {
  public static void main(String args[]) {
    int [][] test = new int[3][3];
    
    for (int i = 0; i < test.length; i++) {
        System.out.println(" ");
        
        for(int j = 0; j < test[i].length; j++) {
            test[i][j] = (int)(Math.random()*10) + 1;
            
            System.out.print(test[i][j] + " ");
        }
    }
    
    System.out.println(" ");
    
    
    for (int i = 0; i < test.length; i++) {
        System.out.println(" ");
        
        for(int j = 0; j < test[i].length; j++) {
            
            Arrays.sort(test[i]);
            System.out.print(test[i][j] + " ");
        }
    }

    
    /*this project is a nexted loop that iterates through my 2D array. 
    It assigns a random value 1-10 inclusive of both to each cell of the array
    it then prints out all the values it generated
    import java.util.Arrays; allows the use of more array methods
    */
    
    
    
  }
}