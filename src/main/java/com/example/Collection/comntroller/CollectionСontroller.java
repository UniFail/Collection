package com.example.Collection.comntroller;

import com.example.Collection.service.CollectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "List")
public class CollectionСontroller {
    private final CollectionService collectionService;

    public CollectionСontroller(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping(path = "addNumbers")
    public List<Integer> add(@RequestParam("num") int num) {
        return collectionService.add(num);
    }

    @GetMapping(path = "oddNumbers")
    public List<Integer> oddNumber() {
        return collectionService.oddNumber();
    }

    @GetMapping(path = "evenNumbers")
    public Set<Integer> evenNumber() {
        return collectionService.evenNumber();
    }

    @GetMapping(path = "uniqueWord")
    public Set<String> uniqueWord(@RequestParam("sentence") String sentence) {
        return collectionService.uniqueWord(sentence);

    }

    @GetMapping(path = "quantityWord")
    public List<Integer> quantityWord(@RequestParam("sentence") String sentence) {
        return collectionService.quantityWord(sentence);

    }
}

