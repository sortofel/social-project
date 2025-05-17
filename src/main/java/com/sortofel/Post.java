package com.sortofel;

public class Post {

    private String friend;

    private int time = (int) (Math.random()*30);

    private String post;

    private int creatOrView;

    public Post() {}

    public Post(String friend, int time, String post) {
        this.post = post;
        this.friend = friend;
        this.time = time;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int creatOrView() {
        return this.creatOrView;
    }

    public void setCreatOrView(int creatOrView) {
        this.creatOrView = creatOrView;
    }
    //post 초기값 설정자, getter, setter
}
