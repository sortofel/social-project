package com.sortofel;

import java.util.Scanner;

public interface Reaction {
    default void reactSelector() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===친구의 게시물에 반응하기===");
        System.out.println("1. 좋아요 누르기");
        System.out.println("2. 재게시하기");
        System.out.println("3. 공유하기");
        System.out.println("0. 나가기");
        System.out.print("번호를 선택하세요 : ");

        User user = new User();

        boolean run = true;

        while (run) {

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    user.pushLike(); break;
                case 2:
                    user.pushRepost(); break;
                case 3:
                    user.pushShare(); break;
                case 0:
                    run = false;
                    return;
                default:
                    System.out.println("1~3 번 중 선택하세요");
                    break;
            }
        }
    }

    void react();
}
