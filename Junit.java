package com.JunitTest;

import jdk.jfr.StackTrace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
 // Uc3 = As a User need to enter a valid email
    //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) wit precise @ and . positions
    public boolean validEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z][a-z0-9-.+]*@[a-z0-9]*[.][a-z.]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

  
}
