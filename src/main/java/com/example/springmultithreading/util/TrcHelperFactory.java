package com.example.springmultithreading.util;

import com.example.springmultithreading.util.common.impl.VariableImpl;
import com.example.springmultithreading.util.common.pub.IVariable;
import com.example.springmultithreading.util.common.pub.TrcStringFormatter;

public class TrcHelperFactory {

  public static IVariable _var(String name,Object value) {

    TrcStringFormatter trcStringFormatter = TrcHelper.getTrcStringFormatter();
    return new VariableImpl(trcStringFormatter,name, value);
  }

}
