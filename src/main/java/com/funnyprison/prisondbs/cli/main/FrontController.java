package com.funnyprison.prisondbs.cli.main;

public class FrontController {
    public static void chooseSystem(int selection) {
        switch (selection) {
            case 1:
                System.out.println("# 죄수 관리 시스템을 시작합니다.");
                break;
            case 2:
                System.out.println("# 형량 관리 시스템을 시작합니다.");
                break;
            case 3:
                System.out.println("# 보석 관리 시스템을 시작합니다.");

                break;
            case 4:
                System.out.println("# 프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("\n### 메뉴를 잘못 선택했습니다.");
        }
    }
}
