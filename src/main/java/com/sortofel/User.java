package com.sortofel;

import com.sortofel.Interface.Like;
import com.sortofel.Interface.Reaction;
import com.sortofel.Interface.Repost;
import com.sortofel.Interface.Share;

import java.util.Scanner;

public class User {

    public void setUser() {
        MyPost myPost = new MyPost();
        Scanner sc = new Scanner(System.in);
        System.out.print("친구들에게 표시될 이름을 입력하세요 : ");
        String currentUser = sc.next();
        myPost.setCurrentUser(currentUser);
    }

    public void viewOldPost () {
        PostList postlist = new PostList();
        postlist.oldPost();
    }

    public void creatMyPost() {
        PostList postlist = new PostList();
        postlist.creatMyPost();
    }

//    public void viewMyPost() {
//        ViewPost viewPost = new ViewPost();
//        viewPost.viewMyPost();
//    }

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
