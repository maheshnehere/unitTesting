package com.JunitTest;

import jdk.jfr.StackTrace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
    public boolean password(String password){
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[\\d])(?=.*[\\W])[\\w\\W]{8,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();

    }

  
}
