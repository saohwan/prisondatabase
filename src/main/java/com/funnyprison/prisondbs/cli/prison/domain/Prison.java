package com.funnyprison.prisondbs.cli.prison.domain;


import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Prison implements List<Prison> {


    //기본 필드
    private int prisonerNumber; // 죄수고유번호!
    private String name;    //이름
    private int age;        //나이
    private String area;    //지역
    private String aCharge; //죄목
    private int jailTime;   //수감시간
    private LocalDateTime endJailTime; //끝나는 수감시간
    private LocalDateTime startJailTime;
    private boolean jailed; //수감상태

    private static int uniqueNumber;


    // 생성자 (초기화까지~)
    public Prison(String name, int age, String area, String aCharge, int jailTime) {
        this.prisonerNumber = ++uniqueNumber;
        this.name = name;
        this.age = age;
        this.area = area;
        this.aCharge = aCharge;
        this.jailTime = jailTime;
        this.startJailTime = LocalDateTime.now();
        this.endJailTime = startJailTime.plusHours(jailTime);
    }

    public int getPrisonerNumber() {
        return prisonerNumber;
    }

    public void setPrisonerNumber(int prisonerNumber) {
        this.prisonerNumber = prisonerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getaCharge() {
        return aCharge;
    }

    public void setaCharge(String aCharge) {
        this.aCharge = aCharge;
    }

    public int getJailTime() {
        return jailTime;
    }

    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }

    public LocalDateTime getEndJailTime() {
        return endJailTime;
    }

    public void setEndJailTime(LocalDateTime endJailTime) {
        this.endJailTime = endJailTime;
    }


    //인스턴스 메소드 (주체 객체가 필요함 . bi.toInfo!!)
    public String toInfo() {
        return String.format("**** 수감자 정보 **** \n 이름 : %s \n 나이 : %d " +
                "\n 지역 : %s \n 죄목 : %s \n 수감시간 : %d, 수감 시작 날짜: %s, \n, " +
                "출소 예정일: %s \n, 수감상태: %s \n ******************** ", name, age, area, aCharge, jailTime, startJailTime, endJailTime, jailed);
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Prison> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Prison prison) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Prison> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Prison> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Prison get(int index) {
        return null;
    }

    @Override
    public Prison set(int index, Prison element) {
        return null;
    }

    @Override
    public void add(int index, Prison element) {

    }

    @Override
    public Prison remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Prison> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Prison> listIterator(int index) {
        return null;
    }

    @Override
    public List<Prison> subList(int fromIndex, int toIndex) {
        return null;
    }
}
