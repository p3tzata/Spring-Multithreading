package com.example.springmultithreading.controller;

import com.example.springmultithreading.model.Counter;
import com.example.springmultithreading.service.RestServiceBAD;
import com.example.springmultithreading.util.TrcHelper;

import static com.example.springmultithreading.util.TrcHelperFactory.*;

import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "BAD")
public class RestControllerBAD {

  private RestServiceBAD restServiceBAD;

  @Autowired
  public RestControllerBAD(RestServiceBAD restServiceBAD) {

    this.restServiceBAD = restServiceBAD;
  }

  @GetMapping(value = "/test1")
  public ResponseEntity<Void> test1() {

    TrcHelper.clearCurent();
    TrcHelper.CALL("main", _var("ss", 4), _var("user", "Pepi"));
    factorial(3);

    TrcHelper.IF();
    TrcHelper.LINE();
    TrcHelper.LINE();
    TrcHelper.EXIT();
    TrcHelper.LINE();
    TrcHelper.EXIT();

    Counter counter = new Counter();

    Runnable runnable1 = () -> this.restServiceBAD.test1(counter);
    CompletableFuture.runAsync(runnable1);
    Runnable runnable2 = () -> this.restServiceBAD.test1(counter);
    CompletableFuture.runAsync(runnable2);

    return ResponseEntity.ok().build();

  }


  static int factorial(int n) {

    TrcHelper.CALL("factorial",_var("n",n));
    if (n != 0)  // termination condition
    {
       int result = n * factorial(n - 1); // recursive call
      TrcHelper.EXIT();
      return result;
    }
    else {
      TrcHelper.EXIT();
      return 1;

    }

  }

}
