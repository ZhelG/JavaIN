package com.company;

public class Chislo1
{
    public static void main(String[] args)
    {
        int i = 12;
        //число 12 в двоичной системе
        System.out.println(Integer.toBinaryString(i));
        //обратный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("1100", 2));
    }
}

