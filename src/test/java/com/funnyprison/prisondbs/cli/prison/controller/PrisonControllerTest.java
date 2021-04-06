package com.funnyprison.prisondbs.cli.prison.controller;

import com.funnyprison.prisondbs.cli.prison.domain.SearchCondition;
import com.funnyprison.prisondbs.cli.prison.repository.MemoryPriosnerRepository;
import com.funnyprison.prisondbs.cli.prison.repository.PrisonerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisonControllerTest {

    private PrisonController controller = new PrisonController();
    private PrisonerRepository repository = new MemoryPriosnerRepository;

    @Test
    @DisplayName("컨트롤러를 통해 수감자 정보를 입력하면 저장되어야할 테스트")
    void insertControlTest()
    {
        controller.start();

        System.out.println("==================================");
        repository.searchPrisonOne("", SearchCondition.ALL).forEach(m -> System.out.println(m));
        System.out.println();
    }}