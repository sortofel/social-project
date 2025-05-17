package com.sortofel;

import com.sortofel.Interface.Like;

import java.util.List;

public class ViewPost {

    public void viewOldPost(Post[] posts) {

        int num = (int) (Math.random() * 3);

        System.out.println(posts[num].getFriend() + "님이 " + posts[num].getTime() + "분 전에" + " [" + posts[num].getPost() + "] 라고 작성하셨습니다");

        Like like = new Like();
        like.reactSelector();
    }

//    public void viewMyPost(List<MyPost> posts) {
//        PostList postList = new PostList();
//        for (MyPost myPost : postList.) {
//            System.out.println(myPost.currentUser() + " (" + myPost.time() + "분 전): " + myPost.post()
//                    + "\n [ 좋아요 " + ((int)(Math.random()*4)+1) + "개, " + "재게시 " + ((int)(Math.random()*4)+1) + "회, " + "\n 공유 " + ((int)(Math.random()*4)+1) + "회 ]" );
//        }
//    }
}
