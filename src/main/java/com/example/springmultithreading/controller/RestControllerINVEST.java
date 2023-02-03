package com.example.springmultithreading.controller;


import com.example.springmultithreading.service.RestServiceINVEST;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "INVEST")
public class RestControllerINVEST {

  private RestServiceINVEST restServiceINVEST;

  @Autowired
  public RestControllerINVEST(RestServiceINVEST restServiceINVEST) {
    this.restServiceINVEST = restServiceINVEST;
  }

  @GetMapping(value = "/test1")
  public ResponseEntity<Void> test1(){

    Runnable runnable1 = () -> this.restServiceINVEST.test1();
    CompletableFuture.runAsync(runnable1);

    Runnable runnable2 = () -> this.restServiceINVEST.test1();
    CompletableFuture.runAsync(runnable2);


    return ResponseEntity.ok().build();

  }

}
