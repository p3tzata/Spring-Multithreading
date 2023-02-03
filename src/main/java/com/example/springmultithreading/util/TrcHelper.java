package com.example.springmultithreading.util;

import com.example.springmultithreading.util.common.BlockType;
import com.example.springmultithreading.util.common.impl.DirectoryStringFormatterImpl;
import com.example.springmultithreading.util.common.impl.DirectoryTrcHelperLoggerImp;
import com.example.springmultithreading.util.common.TrcHelperLogger;
import com.example.springmultithreading.util.common.pub.IVariable;
import com.example.springmultithreading.util.common.pub.TrcStringFormatter;
import java.util.Arrays;
import java.util.Stack;

public class TrcHelper {

  private static TrcHelperLogger trcHelperLogger;
  private static TrcStringFormatter trcStringFormatter;
  private static Stack<BlockType> stackBlockType;


  static {
    trcHelperLogger = new DirectoryTrcHelperLoggerImp();
    trcStringFormatter = new DirectoryStringFormatterImpl();
    stackBlockType = new Stack<>();
  }

  public static void clearCurent() {

    trcHelperLogger.clearCurrent();

  }

  public static void CALL(String methodName, IVariable... variables) {

    trcHelperLogger.appendNode(trcStringFormatter.callToString(methodName,variables));
    stackBlockType.add(BlockType.METHOD);

  }

  public static void IF() {

    trcHelperLogger.appendNode("IF");
    trcHelperLogger.appendNode("THEN");
    stackBlockType.add(BlockType.IF);
  }

  public static void LINE() {

    trcHelperLogger.appendEdge("varTest");
  }

  /**
   * Exit current block
   */
  public static void EXIT() {

    if (stackBlockType.pop() == BlockType.IF) {
      trcHelperLogger.exitNode();
      trcHelperLogger.exitNode();
    }
    else {
      trcHelperLogger.exitNode();
    }
  }

  public static TrcStringFormatter getTrcStringFormatter(){

    return trcStringFormatter;
  }


}
