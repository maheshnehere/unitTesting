package com.JunitTest;

import jdk.jfr.StackTrace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
 // Uc2 = As a User need to enter a valid Last Name = Last name starts with Cap and has minimum 3 characters
 public boolean  lastName(String lastName) {
    Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
    Matcher matcher = pattern.matcher(lastName);
    return matcher.find();
}
     
}
