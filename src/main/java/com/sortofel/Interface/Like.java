package com.sortofel.Interface;

public class Like implements Reaction {

    static boolean liked;

    @Override
    public void react() {

        if (!liked) {
            System.out.println("친구의 게시글에 좋아요를 표시했습니다.");
            liked = true;
        } else {
            System.out.println("좋아요는 한 번만 누를 수 있습니다.");
        }

    }
}


