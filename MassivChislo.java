package com.company;

public class MassivChislo {
    public static void main(String[] args){
        int[] arr = {1 ,2 ,3 ,0 ,5};
        int result = 0;

        for(int i = arr.length - 1, n=0; i>=0; --i,n++){
            int pos = (int)Math.pow(10,i);
            result += arr[n]*pos;

        }
        System.out.println(result);
    }
}
