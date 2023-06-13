import java.util.Scanner;

public class MainSortwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[4];
        
        // Get input from user
        for(int i=0; i<4; i++){
            System.out.print("Enter word #" + (i+1) + ": ");
            words[i] = scanner.nextLine();
        }
        
        // Sort words in ascending order
        SortWords ascendingSort = new SortWords(words);
        ascendingSort.sortAscending();
        System.out.println("Words in ascending order:");
        ascendingSort.printWords();

        // Sort words in descending order
        SortWords descendingSort = new SortWords(words);
        descendingSort.sortDescending();
        System.out.println("Words in descending order:");
        descendingSort.printWords();
        scanner.close();
    }
}

