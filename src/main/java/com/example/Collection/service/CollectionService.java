package com.example.Collection.service;

import java.util.List;
import java.util.Set;

public interface CollectionService {
    List<Integer> add(Integer num);

    List<Integer> oddNumber();

    Set<Integer> evenNumber();

    Set<String> uniqueWord(String sentence);

    List<Integer> quantityWord(String sentence);
}
