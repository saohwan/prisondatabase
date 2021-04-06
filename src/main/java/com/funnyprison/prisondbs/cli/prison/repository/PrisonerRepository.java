package com.funnyprison.prisondbs.cli.prison.repository;




import com.funnyprison.prisondbs.cli.prison.domain.Prison;
import com.funnyprison.prisondbs.cli.prison.domain.SearchCondition;

import java.util.List;

public interface PrisonerRepository {
    //역할: 데이터 저장소 역할을 수행하는 저장소 기능의 명세


    //죄수 정보 추가
    void addPrisoner(Prison prison);

    //조건별 죄수 검색


    /**
     * @param keyword   검색어
     * @param condition 검색 조건
     * @return 검색에 따른 죄수정보 리스트
     */
//    List<Prison> searchMovieList(String keyword, SearchCondition condition);

    /*//특정 죄수 1명 검색
    default Prison searchPrisonOne(String name) {
        return null;
    }

    //특정 죄수 삭제(출소)
    void removePrison(int prisonerlNumber);

    List<Prison> search(String keyword, SearchCondition condition);*/

    List<Prison> searchPrisonerList(String keyword, SearchCondition condition);

    //특정 수감자 1명 검색
    default Prison searchPrisonOne(int prisonerNumber) {
        return null;
    }

    //특정 수감자 삭제(출소)
    void removePrison(int serialNumber);
}
