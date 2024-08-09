
import java.util.Scanner;

interface Library{
    String[] book = new String[100];
    void addBook(String b);
    void removeBook(int c);
    void checkAllBook();
    
}
class Data implements Library{
    static int i=0;
    public void addBook(String b)
    {
        while(i<book.length)
        {
            book[i]=b;
            System.out.println("Book Added Successfully!");
            i++;
            break;
        }
    }
    public void removeBook(int c) {
        int d = c - 1;
    
        if (d < 0 || d >= i) {
            System.out.println("Enter a Correct Index!");
            return;
        }
    
        for (int j = d; j < i - 1; j++) { 
            book[j] = book[j + 1];
        }
    
        book[i - 1] = null;
        i--;
        System.out.println("Book Removed Successfully!");
    }
    
    public void checkAllBook()
    {   
        System.out.println("Total Books Available Are");
        for(int s=0; s<i; s++)
        {
            System.out.println((s+1)+" := "+book[s]);
        }
    }

}
public class SimpleLibrarySystem extends Data {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        SimpleLibrarySystem o = new SimpleLibrarySystem();
        

        while (true) {
            System.out.println("\nSimple Library System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Check All Book");
            System.out.print("Choose an option: ");
            int choice = kb.nextInt();
            kb.nextLine();
            String b ="";
            int c=0;

            switch (choice) {
                case 1 :System.out.print("Enter Book Name => ");
                        b = kb.nextLine();
                        o.addBook(b);
                        System.out.println();
                        break;
                case 2 :System.out.print("Enter Book Index => ");
                        c = kb.nextInt();
                        o.removeBook(c);
                        System.out.println();
                        break;
                case 3 :o.checkAllBook();
                        System.out.println();
                        break;
                default:System.out.println("Please Enter Value Within The Range (1-3)");
                    break;
            }
    }

}
}



