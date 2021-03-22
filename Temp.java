package com.company;

public class Temp {
    public static void main(String[] args){
        String[] a = {" 12 ", " 13 ", " 2 ", " 4 ", " 5 "};
        //Выводим изначальный массив в консоль
        for(int i=0; i>a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная,которая будет использоваться при обмене элементов
        String b;
for(int i=0; i<n/2;i++){
    b = a[n-i-1];
    a[n-i-1] = a[i];
    a[i] = b;
        }

        for (int i=0 ; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
