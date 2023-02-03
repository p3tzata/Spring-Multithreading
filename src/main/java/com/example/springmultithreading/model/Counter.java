package com.example.springmultithreading.model;

public class Counter {

  private Integer cnt=0;

  public void setCnt(Integer cnt) {

    this.cnt = cnt;
  }

  public Integer getCnt() {

    return cnt;
  }

  public void incr(){
    cnt++;
  }
}
