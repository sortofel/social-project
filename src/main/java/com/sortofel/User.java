package com.sortofel;

public class User {

    public void viewOldPost () {
        PostList postlist = new PostList();
        postlist.oldPost();
    }

    public void pushLike () {
        Reaction like = new Like();
        like.react();
        like.reactSelector();
    }

    public void pushRepost () {
        Reaction repost = new Repost();
        repost.react();
        repost.reactSelector();
    }

    public void pushShare () {
        Reaction share = new Share();
        share.react();
        share.reactSelector();
    }

}
