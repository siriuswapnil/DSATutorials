package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {-1,4,5,-2,9};
        int max_sum=arr[0];
        int res=arr[0];
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            max_sum=Math.max(max_sum+arr[i],arr[i]);
            res=Math.max(res,max_sum);
        }
        System.out.print(res);

    }
}
