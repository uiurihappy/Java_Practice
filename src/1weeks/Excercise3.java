

//3. 간단한 블로그 프로그램을 작성하세요
//        - 기능1: 프로그램이 시작 되면 메뉴를 정보를 출력하세요(1 - View blog list, 2 - Write a blog post, 3 - Quit)
//        - 기능2: 사용자로부터 메뉴를 입력 받으세요
//        - 기능3: 사용자가 1을 선택할 경우 작성 된 블로그 리스트를 출력하세요.
//        블로그 리스트 출력 후에는 다시 메뉴 정보가 노출됩니다.
//        - 기능3: 사용자가 2를 선택할 경우 블로그 글을 작성할 수 있습니다.
//        블로그 글은 제목과 내용이 저장 됩니다. 블로그 글 저장이 끝나면 다시 메뉴 정보가 노출됩니다.
//        - 기능4: 사용자가 3을 선택할 경우 프로그램이 종료 됩니다.
//        - 조건2: 블로그 글은 최대 20개까지만 저장할 수

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        String[] titles = new String[20];
        String[] posts = new String[20];
        int menu;
        int countOfPosts = 0;
        boolean isQuit = false;

        while(!isQuit) {
            System.out.println("\n1 - View blog lists");
            System.out.println("2 - Write a blog post");
            System.out.println("3 - quit");
            System.out.print("Enter the menu : ");
            Scanner input = new Scanner(System.in);

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    for(int i = 0; i < countOfPosts; i++)
                        System.out.println(titles[i] + " | " + posts[i]);

                    break;
                case 2:
                    System.out.print("Enter title : ");
                    Scanner inputTitle = new Scanner(System.in);
                    String title = inputTitle.nextLine();
                    titles[countOfPosts] = title;


                    System.out.print("Enter post : ");
                    Scanner inputPost = new Scanner(System.in);
                    String post = inputPost.nextLine();
                    posts[countOfPosts] = post;
                    countOfPosts++;

                    break;
                case 3:
                    isQuit = true;
                    break;
            }


        }
    }
}
