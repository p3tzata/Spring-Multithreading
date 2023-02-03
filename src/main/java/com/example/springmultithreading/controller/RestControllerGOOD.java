package com.example.springmultithreading.controller;


import com.example.springmultithreading.service.RestServiceGOOD;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "GOOD")
public class RestControllerGOOD {

  private RestServiceGOOD restServiceGOOD;

  @Autowired
  public RestControllerGOOD(RestServiceGOOD restServiceGOOD) {
    this.restServiceGOOD = restServiceGOOD;
  }

  @GetMapping(value = "/test1")
  public ResponseEntity<Void> test1(){



    Runnable runnable1 = () -> this.restServiceGOOD.test1();
    CompletableFuture.runAsync(runnable1);

    Runnable runnable2 = () -> this.restServiceGOOD.test1();
    CompletableFuture.runAsync(runnable2);


    return ResponseEntity.ok().build();

  }

}
