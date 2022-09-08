/*
 * CC 13 - Singly Linked List
 * Output by Clint Harvey Gamolo and Adriane Troy V. Roa
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    IntSLList slList = new IntSLList(); 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
        System.out.println();
        System.out.print("""
          0 -  Exit 
          1 - Add to head  
          2 - Add to tail 
          3 - Delete from head 
          4 - Delete from tail 
          5 - Is in list 
          6 - Delete a value 
          7 - Print all 

          Choice:
          """);
      int userChoice = Integer.parseInt(br.readLine()); 
      switch (userChoice) {
        case 0:
          System.out.println("Terminating the program");
          System.exit(0);
          break;
        case 1:
          System.out.println("Enter value to add to head of list: ");
          int choice = Integer.parseInt(br.readLine());
          slList.addToHead(choice);
          System.out.println(choice + " is successfully added to the head!");
          break;
        case 2:
          System.out.println("Enter value to add to tail of list: ");
          choice = Integer.parseInt(br.readLine());
          slList.addToTail(choice);
          System.out.println(choice + " is successfully added to the tail!");
          break;
        case 3:
          int x = slList.deleteFromHead();
          System.out.println(x + " deleted from head successfully!");
          break;
        case 4:
          x = slList.deleteFromTail();
          System.out.println(x + " deleted from tail successfully!");
          break;
        case 5:
          System.out.println("Enter value to check: ");
          choice = Integer.parseInt(br.readLine());
          if(slList.isInList(choice)) System.out.println(choice+" is in list.");
          else System.out.println(choice+" is not in list.");
          break;
        case 6:
          System.out.println("Enter value to delete:");
          choice = Integer.parseInt(br.readLine());
          slList.delete(choice);
          break;
        case 7:
          slList.printAll();
          break;
        default:
          System.out.println("Wrong number entered!");
          break;
      }
      System.out.print("Press any key to continue...");
      br.readLine();                  
    }
  }
}
