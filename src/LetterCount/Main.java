package LetterCount;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String str = scanner.nextLine();

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
        // split white space
        String[] words = str.split("\\s+");
        for (String word : words) {
            // count word occurence 
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        // remove space character 
        String characters = String.join("", words);

        for (char c : characters.toCharArray()) {
            // count letter occurence 
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        // print word occurence 
        System.out.print("{");
        for (Map.Entry<String, Integer> wordEntry : wordMap.entrySet()){
            System.out.print(wordEntry.getKey()+"="+wordEntry.getValue()+", ");
        }
        System.out.print("\b\b");
        System.out.println("}");
        
         // print character occurence 
        System.out.print("{");
        for (Map.Entry<Character, Integer> charEntry: charMap.entrySet()){
            System.out.print(charEntry.getKey()+"="+charEntry.getValue()+", ");
        }
        System.out.print("\b\b");
        System.out.println("}");
    }
     
    
    
}

