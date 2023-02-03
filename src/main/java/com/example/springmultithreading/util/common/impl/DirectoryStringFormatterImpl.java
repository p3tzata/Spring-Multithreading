package com.example.springmultithreading.util.common.impl;

import com.example.springmultithreading.util.common.pub.TrcStringFormatter;
import com.example.springmultithreading.util.common.pub.IVariable;
import java.util.Arrays;

public class DirectoryStringFormatterImpl implements TrcStringFormatter {

  @Override
  public String callToString(String callName, IVariable... variables) {

    String varString;
    StringBuilder strVarBuilder = new StringBuilder();
    Arrays.stream(variables).forEach(x -> strVarBuilder.append(x.getString() + ","));
    varString = strVarBuilder.toString();
    if(strVarBuilder.length()>0) {
      varString=strVarBuilder.substring(0, strVarBuilder.length() - 1);
    }

    return "CALL_" + callName + "(" + varString + ")";
  }

  @Override
  public String ifToString() {

    return null;
  }

  @Override
  public String variableToString(String varName, Object value) {

    return String.format("(%s=%s)", varName, value.toString());
  }

}
