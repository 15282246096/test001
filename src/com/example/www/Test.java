package com.example.www;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello world !");
        List<String> list = new ArrayList<>();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
        System.out.println(date.getTime());
        System.out.println(date.toInstant().toString().replace("T"," ").replace("Z",""));
        System.out.println(format.format(date));
    }
}
