package com.example.springmultithreading.service;

import com.example.springmultithreading.model.Counter;
import com.example.springmultithreading.util.TrcHelper;
import org.springframework.stereotype.Service;

@Service
public class RestServiceGOOD {

  public void test1(){



    Counter counter = new Counter();

    for(int i=0;i<1000*10;i++) {
       counter.incr();
     }

     System.out.println(counter.getCnt());
  }


}
