package com.sortofel;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        Post post = new Post();

        while (true) {
            System.out.println("=====게시물 서비스=====");
            System.out.println("1. 친구들의 게시물 보기");
            System.out.println("2. 게시물 추가하기");
            System.out.println("3. 친구들의 반응 보기");
            System.out.println("0. 나가기");
            System.out.print("번호를 선택하세요 : ");

            int no = sc.nextInt();
            sc.nextLine(); //엔터 지우기

            switch (no) {
                case 1:
                    user.viewOldPost();
                    break;
                case 2:
                    post.setCreatOrView(1);
                    user.creatMyPost();
                    break;
                case 3:
                    post.setCreatOrView(2);
                    user.creatMyPost();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("선택 가능한 범위를 벗어났습니다.");
                    break;
            }
        }
    }
}
