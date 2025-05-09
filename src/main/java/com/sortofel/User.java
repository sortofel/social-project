package com.sortofel;

public class User {

    public void viewOldPost () {
        PostList postlist = new PostList();
        postlist.oldPost();
    }

    public void pushLike () {
        Like like = new Like();
        like.react();
        like.reactSelector();
    }

    public void pushRepost () {
        Like repost = new Repost();
        repost.react();
        repost.reactSelector();
    }

    public void pushShare () {
        Like share = new Share();
        share.react();
        share.reactSelector();
    }

}
