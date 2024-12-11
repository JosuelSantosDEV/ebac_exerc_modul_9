package com.example;

import java.util.Scanner;

public class ReadIntAndConvertToInteger {
    private Scanner sc = new Scanner(System.in);
    private int intNumber;
    private Integer integerNumber;

    public void readInt(){
        System.out.println("Informe um int: ");
        this.intNumber = sc.nextInt();
    }
    public void convertToInteger(){
        this.integerNumber = this.intNumber;
    }
    public int getIntNumber(){
        return this.intNumber;
    }
    public Integer getIntegerNumber(){
        return this.integerNumber;
    }
}
