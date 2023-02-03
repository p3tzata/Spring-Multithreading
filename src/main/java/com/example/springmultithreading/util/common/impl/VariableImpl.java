package com.example.springmultithreading.util.common.impl;

import com.example.springmultithreading.util.common.pub.IVariable;
import com.example.springmultithreading.util.common.pub.TrcStringFormatter;

public class VariableImpl implements IVariable {

  String name;
  Object value;
  TrcStringFormatter trcStringFormatter;

  public VariableImpl(TrcStringFormatter trcStringFormatter,String name, Object value) {

    this.name = name;
    this.value = value;
    this.trcStringFormatter = trcStringFormatter;
  }

  @Override
  public String getString() {

    return trcStringFormatter.variableToString(name, value);

  }
}
