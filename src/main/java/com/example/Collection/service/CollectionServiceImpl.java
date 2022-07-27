package com.example.Collection.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CollectionServiceImpl implements CollectionService {
    List<Integer> numList = new ArrayList<>(Arrays.asList());

    public List<Integer> add(Integer num) {
        numList.add(num);
        return numList;
    }

    public List<Integer> oddNumber() {
        List<Integer> oddNumber = new ArrayList<>(Arrays.asList());
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 != 0) {
                oddNumber.add(numList.get(i));
            }
        }
        return oddNumber;
    }

    public Set<Integer> evenNumber() {
        Set<Integer> evenNumber = new HashSet<>(Arrays.asList());
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0) {
                evenNumber.add(numList.get(i));
            }
        }
        return evenNumber;
    }

    public Set<String> uniqueWord(String sentence) {
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Set<String> uniqueWords = new HashSet<>();
        for (String word : wordList) {
            if (Collections.frequency(wordList, word) == 1) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }

    public List<Integer> quantityWord(String sentence) {
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Set<String> uniqueWords = new HashSet<>(wordList);
        List<Integer> uniqueNumbers = new ArrayList<>(List.of());
        for (String word : uniqueWords) {
            if (Collections.frequency(wordList, word) > 1) {
                uniqueNumbers.add(Collections.frequency(wordList, word));
            }
        }
        return uniqueNumbers;
    }


}
