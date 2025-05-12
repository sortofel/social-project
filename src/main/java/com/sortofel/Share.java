package com.sortofel;

public class Share implements Reaction {

    static boolean shared = false;

    @Override
    public void react() {
        if (!shared) {
            System.out.println("친구의 게시물을 공유했습니다.");
            shared = true;
        } else {
            System.out.println("게시물은 한 번만 공유할 수 있습니다.");
        }
    }
}
