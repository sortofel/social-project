package com.sortofel;

import java.util.Scanner;

public class MyPost {

    private String currentUser;

    private int time;

    private String post;

    public MyPost() {}

    public MyPost (int time, String post) {
        this.time = time;
        this.post = post;
    }

    public int time() {
        return time;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String currentUser() {
        return currentUser;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String post() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    //post 초기값 설정자, getter, setter
}
