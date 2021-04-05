package com.company;
//Вывести на печать расположение каждой отдельной буквы слова Hello!
// которой соотвествует определенное положение в базовой таблице ASCII
public class CHHi {
    public static void main(String[] args) {
        char a = 'H';
        System.out.println(a);
        System.out.println("Номер элемента в ASCII: " + (int) a);

        char b = 'e';
        System.out.println(b);
        System.out.println("Номер элемента в ASCII: " + (int) b);

        char c = 'l';
        System.out.println(c);
        System.out.println("Номер элемента в ASCII: " + (int) c);

        char d = 'l';
        System.out.println(d);
        System.out.println("Номер элемента в ASCII: " + (int) d);

        char e = 'o';
        System.out.println(e);
        System.out.println("Номер элемента в ASCII: " + (int) e);

        char f = '!';
        System.out.println(f);
        System.out.println("Номер элемента в ASCII: " + (int) f);

        char[] n ={a,b,c,d,e,f};
        System.out.println(n);
    }

}
