package com.example.springmultithreading.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
public class Collectors_ {

  public void flatMapping(){

    Author author1 = new Author("Ivo", new ArrayList<>() {
      {
        add("Geeks");
        add("for");
        add("Geeks");
      }
    });

    Author author2 = new Author("Ivo", new ArrayList<>() {
      {
        add("Geeks9");
        add("for");
        add("Geeks");
      }
    });
    Author author3 = new Author("Pepi", new ArrayList<>() {
      {
        add("Geeks9");
        add("for");
        add("Geeks");
      }
    });

    ArrayList<Author> authors = new ArrayList<>() {{
      add(author1);
      add(author2);
      add(author3);
    }};

    Object collect = authors.stream().collect(
        Collectors.groupingBy(Author::getName,
                              Collectors.flatMapping(el -> el.getComments().stream(),Collectors.toList() ))
    );
    System.out.println(collect);

    String s="tt";





  }

}
