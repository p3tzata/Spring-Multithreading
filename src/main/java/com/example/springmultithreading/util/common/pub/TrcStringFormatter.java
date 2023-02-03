package com.example.springmultithreading.util.common.pub;

public interface TrcStringFormatter {

  String callToString(String callName, IVariable... variables);

  String ifToString();

  String variableToString(String varName, Object value);

}
