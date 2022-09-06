import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    IntSLList slList = new IntSLList(); 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
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
          break;
        case 2:
          System.out.println("Enter value to add to tail of list: ");         
          userChoice = Integer.parseInt(br.readLine());
          slList.addToTail(userChoice);
          System.out.println(userChoice + " is successfully added to the tail!");
          break;
        case 3:
          break;
        case 4:
          int x = slList.deleteFromTail();
          System.out.println(x + " deleted from tail successfully!");
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          System.out.print("Values in list: ");
          slList.printAll();
          break;
      }
    }
  }
}
