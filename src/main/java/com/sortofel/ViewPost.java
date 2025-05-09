package com.sortofel;

public class ViewPost {

    public void viewPost(Post[] posts) {

        int num = (int) (Math.random() * 3);

            System.out.println(posts[num].getFriend() + "님이 " + posts[num].getTime() + "분 전에" + " [" + posts[num].getPost() + "] 라고 작성하셨습니다");

            Like like = new Like();
            like.reactSelector();

    }

}
