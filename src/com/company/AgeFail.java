package com.company;

public class AgeFail extends Exception{
    @Override
    public String getMessage() {
        return "Ban chua du 18 tuoi";
    }
}