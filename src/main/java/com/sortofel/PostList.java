package com.sortofel;

public class PostList {

    static public void oldPost() {

        Post[] posts = new Post[3];
        Post timeInfo = new Post();

        posts[0] = new Post("Damon", timeInfo.getTime(), "post1");
        posts[1] = new Post("Graham", timeInfo.getTime(), "post2");
        posts[2] = new Post("Alex", timeInfo.getTime(), "post3");

        ViewPost viewPost = new ViewPost();
        viewPost.viewPost(posts);
        }

    }
