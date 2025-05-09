package com.sortofel;

import java.util.Scanner;

public class Like {

    public void reactSelector() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===친구의 게시물에 반응하기===");
        System.out.println("1. 좋아요 누르기");
        System.out.println("2. 재게시하기");
        System.out.println("3. 공유하기");
        System.out.println("0. 나가기");
        System.out.print("번호를 선택하세요 : ");

        int num = sc.nextInt();

        User user = new User();

        switch (num) {
            case 1:
                user.pushLike();
            case 2:
                user.pushRepost();
            case 3:
                user.pushShare();
            case 0:
                break;
            default:
                System.out.println("1~3 번 중 선택하세요");
                break;
        }
    }

    static int i = 0;

    public void react() {

        if (i == 0) {
            System.out.println("친구의 게시글에 좋아요를 표시했습니다.");
            i++;
        } else {
            System.out.println("좋아요는 한 번만 누를 수 있습니다.");
        }
    }
}


