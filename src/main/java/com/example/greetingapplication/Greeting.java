package com.example.greetingapplication;


public class Greeting {
    private long id;
//    public long getId() {
//        return id;
//    }
//    public void setId(long id) {
//        this.id = id;
//    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    private String content;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

}