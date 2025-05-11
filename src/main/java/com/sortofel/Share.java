package com.sortofel;

import static com.sortofel.Like.i;

public class Share implements Reaction {

    @Override
    public void react() {
        if (i == 0) {
            System.out.println("친구의 게시물을 공유했습니다.");
            i++;
        } else {
            System.out.println("게시물은 한 번만 공유할 수 있습니다.");
        }
    }
}
