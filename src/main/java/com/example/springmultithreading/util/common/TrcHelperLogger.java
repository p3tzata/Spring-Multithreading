package com.example.springmultithreading.util.common;

public interface TrcHelperLogger {

   void appendEdge(String edges);
   void appendNode(String node);

   void clearCurrent();
   void exitNode();

}
