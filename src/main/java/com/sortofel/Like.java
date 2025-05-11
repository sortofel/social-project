package com.sortofel;

import java.util.Scanner;

public class Like implements Reaction {

    static int i = 0;

    @Override
    public void react() {

        if (i == 0) {
            System.out.println("친구의 게시글에 좋아요를 표시했습니다.");
            i++;
        } else {
            System.out.println("좋아요는 한 번만 누를 수 있습니다.");
        }
    }
}


