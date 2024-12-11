package com.example;

public class Main {
    public static void main(String[] args) {
        ReadIntAndConvertToInteger readIntAndConvertToInteger = new ReadIntAndConvertToInteger();

        // Lendo um inteiro
        readIntAndConvertToInteger.readInt();
        // Imprimindo o inteiro lido
        System.out.println("Int: "+ readIntAndConvertToInteger.getIntNumber());
        // Convertendo para Wrapper class Integer
        readIntAndConvertToInteger.convertToInteger();
        // Inprimindo Integer
        System.out.println("Integer: "+ readIntAndConvertToInteger.getIntegerNumber());
        // Tipo do valor
        System.out.println(readIntAndConvertToInteger.getIntegerNumber().getClass().getName());
    }
}