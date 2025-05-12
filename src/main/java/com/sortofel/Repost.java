package com.sortofel;

public class Repost implements Reaction {

    static boolean reposted = false;

    @Override
    public void react() {
        if (!reposted) {
            System.out.println("친구의 게시물을 재게시했습니다.");
            reposted = true;
        } else {
            System.out.println("재게시는 한번만 할 수 있습니다.");
        }
    }

}
