package com.example.springmultithreading.service;

import org.springframework.stereotype.Service;

@Service
public class RestServiceINVEST {

  public void test1(){

     Integer cnt=0;
     for(int i=0;i<1000*1000;i++) {
       cnt++;
     }

     System.out.println(cnt);
  }


}
