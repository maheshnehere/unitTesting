package com.JunitTest;

import jdk.jfr.StackTrace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
// Uc4 = As a User need to follow pre -define Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
public boolean phoneNumber(String phoneNumber) {
    Pattern pattern = Pattern.compile("^[+]\\d{2} \\d{10}$");
    Matcher matcher = pattern.matcher(phoneNumber);
    return matcher.find();
}

  
}
