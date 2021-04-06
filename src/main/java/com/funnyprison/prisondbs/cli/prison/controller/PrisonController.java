package com.funnyprison.prisondbs.cli.prison.controller;

import com.funnyprison.prisondbs.cli.prison.domain.Prison;
import com.funnyprison.prisondbs.cli.prison.repository.MemoryPriosnerRepository;
import com.funnyprison.prisondbs.cli.prison.repository.PrisonerRepository;

import static com.funnyprison.prisondbs.cli.ui.AppUI.*;

public class PrisonController {
    //수감자 저장소와 의존 관계 설정
    private final PrisonerRepository prisonerRepository;


    public PrisonController() {
        prisonerRepository = new MemoryPriosnerRepository();
    }

    //제어 기능 시작
    public void start() {
        while (true) {

            prisonerManagementScreen();
            int selection = inputInteger(">>> ");

            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("\n# 메뉴를 다시 입력하세요.");
            }
        }
    }

    //수감자 정보 검색 기능
    private void showSearchPrisonerData() {

        showSearchConditionScreen();
        int selection = inputInteger(">>> ");


    }

    public void insertPrisonerData() {

        System.out.println("\n======= 신규 수감자 정보를 추가합니다. ========");
        String name = inputString("# 이름: ");
        int age = inputInteger("# 나이: ");
        String area = inputString("# 지역: ");
        String aCharge = inputString("# 죄목 : ");
        int jailTime = inputInteger("# 형량 ");

        //저정할 수감자 정보
        Prison prison = new Prison(name, age, area, aCharge, jailTime);

        //저장 명령
        prisonerRepository.addPrisoner(prison);
        System.out.printf("\n### [%s] 수감자 정보가 정상 추가되었습니다.\n", prison.getName());

    }
}
