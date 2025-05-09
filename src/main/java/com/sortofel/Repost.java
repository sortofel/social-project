package com.sortofel;

public class Repost extends Like {

    @Override
    public void react() {
        if (i == 0) {
            System.out.println("친구의 게시물을 재게시했습니다.");
            i++;
        } else {
            System.out.println("재게시는 한번만 할 수 있습니다.");
        }
    }

}
