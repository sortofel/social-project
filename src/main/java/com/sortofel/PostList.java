package com.sortofel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class PostList {

    public static void oldPost() {

        Post[] oldPosts = new Post[3];
        Post timeInfo = new Post();

        oldPosts[0] = new Post("Damon", timeInfo.getTime(), "post1");
        oldPosts[1] = new Post("Graham", timeInfo.getTime(), "post2");
        oldPosts[2] = new Post("Alex", timeInfo.getTime(), "post3");

        ViewPost viewPost = new ViewPost();
        viewPost.viewOldPost(oldPosts);
    }

    public void creatMyPost() {

        Post post = new Post();

        Scanner sc = new Scanner(System.in);

        int time = ((int) ((Math.random()) * 30) + 1);

        System.out.print("무슨 일이 일어나고 있나요? ");
        String content = sc.nextLine();

        List<MyPost> myPostsList = new ArrayList<>();
        myPostsList.add(new MyPost(time, content));

        if (post.creatOrView() == 1) {
            System.out.println("게시물을 저장했습니다!");
        } else if (post.creatOrView() == 2) {
            for (MyPost myPost : myPostsList) {
                System.out.println(myPost.currentUser() + "님이 " + time + "분 전 [" + myPost.post() + "] 라고 남기셨습니다!"
                        + "\n [ 좋아요 " + ((int) (Math.random() * 4) + 1) + "개, " + "재게시 " + ((int) (Math.random() * 4) + 1) + "회, " + "공유 " + ((int) (Math.random() * 4) + 1) + "회 ]");
            }
        }
    }

}


