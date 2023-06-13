import java.util.Arrays;

public class SortWords {
    private String[] words;

    public SortWords(String[] words){
        this.words = words;
    }

    public void sortAscending(){
        Arrays.sort(words);
    }

    public void sortDescending(){
        Arrays.sort(words, (a, b) -> b.compareTo(a));
    }

    public void printWords(){
        for(String word : words){
            System.out.println(word);
        }
    }
}