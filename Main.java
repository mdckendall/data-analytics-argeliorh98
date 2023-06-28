import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		String names;
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    int choice;
    Scanner in = new Scanner (System.in);
		do {
  System.out.println ("Press 1 to learn about salary.");
  System.out.println("Press 2 to learn about the job.");
  System.out.println("Press 3 to learn about demand.");
  System.out.println("Press 4 to view current students.");
  System.out.println("Press 5 to quit.");
 choice = in.nextInt();
switch (choice)
{
  case 1: 
    System.out.println ("$98,345 average salary in South Florida!");
    break;
  case 2:
    System.out.println ("US - 100 Best News Jobs!");
    break;
  case 3:
    System.out.println ("Top 10-Forbes in demand jobs");
    break;
  case 4:
      System.out.println ("Current students:");
    while (fileScanner.hasNextLine()){
      names = fileScanner.nextLine();
      System.out.println (names);
    }
      break;
  case 5:
    System.out.println ();
    break;
  default:
    System.out.println ("Invalid choice, please try again");
    break;
  
  }
  } while (choice != 5);
    }

}

	
  
