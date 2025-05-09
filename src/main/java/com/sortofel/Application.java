package com.sortofel;

import java.util.Scanner;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        while (true) {
            System.out.println("=====게시물 서비스=====");
            System.out.println("1. 게시물 보기");
            System.out.println("0. 나가기");
            System.out.print("번호를 선택하세요 : ");

            int no = sc.nextInt();

            switch (no) {
                    case 1:
                        user.viewOldPost();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("선택 가능한 범위를 벗어났습니다.");
                        break;
            }
        }
    }
}
