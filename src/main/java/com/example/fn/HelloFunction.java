package com.example.fn;

import org.json.JSONObject;

public class HelloFunction {

    public String handleRequest(String input) {
        System.out.println("Inside Java Hello World function");

        String name = (input == null || input.isEmpty()) ? "world" : input;

        JSONObject jo = new JSONObject();

        jo.put("Hello", name);
        String answer = jo.toString();
        System.out.println("JSONObject transformed in String" + answer);

        
       return answer;

    }

}
