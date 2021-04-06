package com.funnyprison.prisondbs.cli.ui;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUI {
    private static Scanner sc = new Scanner(System.in);

    //입력 유틸메서드
    //정수 입력 메서드
    public static int inputInteger(String msg) {

        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수로 입력해주세요!");
            } finally {
                sc.nextLine();
            }
        }
    }

    //문자열 입력 메서드
    public static String inputString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }


    //감옥 관리 시스템 시작화면 출력
    public static void startScreen() {
        System.out.println("\n========= 감옥 관리 시스템 =========");
        System.out.println("### 1. 죄수 관리 시스템");
        System.out.println("### 2. 형량 관리 시스템");
        System.out.println("### 3. 보석 관리 시스템");
        System.out.println("### 4. 프로그램 종료");
        System.out.println("----------------------------------------");
    }

    //죄수 관리 시스템 화면 출력
    public static void prisonerManagementScreen() {
        System.out.println("\n========= 죄수 관리 시스템 =========");
        System.out.println("### 1. 신규 죄수 추가");
        System.out.println("### 2. 죄수 검색");
        System.out.println("### 3. 죄수 출소");
        System.out.println("### 4. 죄수 전체 검색");
        System.out.println("### 5. 첫 화면으로 가기");
        System.out.println("----------------------------------------");
    }

    //형량 관리 시스템 화면 출력
    public static void pleaManagementScreen() {
        System.out.println("\n========= 형량 관리 시스템 =========");
        System.out.println("### 1. 형량 추가하기");
        System.out.println("### 2. 형량 감형하기");
        System.out.println("### 3. 첫 화면으로 가기");
        System.out.println("----------------------------------------");
    }

    //보석 관리 시스템 화면 출력
    public static void bailManagementScreen() {
        System.out.println("\n========= 보석 관리 시스템 =========");
        System.out.println("### 1. 보석금 추가");
        System.out.println("### 2. 보석금 정보 검색");
        System.out.println("### 3. 첫 화면으로 가기");
        System.out.println("----------------------------------------");
    }

    //죄수 검색 조건 화면
    public static void showSearchConditionScreen() {
        System.out.println("\n============== 죄수 검색 조건을 선택하세요. ===============");
        System.out.println("[ 1. 이름검색 | 2. 지역검색 | 3. 죄목검색 | 4. 전체검색 ]");
    }

}
