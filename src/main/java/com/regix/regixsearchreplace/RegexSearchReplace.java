package com.regix.regixsearchreplace;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSearchReplace {

    public static void main(String[] args) {
        // Sample text
        String text = "The quick brown fox jumps over the lazy dog.";

        // Word to find and replace
        String wordToFind = "fox";
        String replacementWord = "cat";

        // Create a regex pattern using the word to find
        Pattern pattern = Pattern.compile(wordToFind);

        // Create a matcher to search for the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Replace all occurrences of the word to find with the replacement word
        String updatedText = matcher.replaceAll(replacementWord);

        // Display the original and updated text
        System.out.println("Original Text: " + text);
        System.out.println("Updated Text: " + updatedText);
    }
}

