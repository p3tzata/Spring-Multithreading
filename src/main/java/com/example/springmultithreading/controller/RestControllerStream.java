package com.example.springmultithreading.controller;

import com.example.springmultithreading.stream.Collectors_;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Stream")
public class RestControllerStream {

  private Collectors_ collectors = new Collectors_();

  @GetMapping(value = "/flatMapping")
  public ResponseEntity<Void> flatMapping() {
    this.collectors.flatMapping();


    return ResponseEntity.ok().build();
  }



}
