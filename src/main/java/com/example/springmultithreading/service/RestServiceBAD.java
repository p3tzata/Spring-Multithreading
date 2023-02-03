package com.example.springmultithreading.service;

import com.example.springmultithreading.model.Counter;
import org.springframework.stereotype.Service;

@Service
public class RestServiceBAD {
  public void test1(Counter counter){

    for(int i=0;i<1000*10;i++) {
      counter.incr();
    }
    System.out.println(counter.getCnt());
  }

}
