package com.demo.fib;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class FibonaciService {

    public List<Integer> getFibSeries(int n){

        //1 , 1-1, 2-2, 3-3, 5-4, 8, 13

        List<Integer> list = new ArrayList<>();

        if(n == 1){
            list.add(1);
            return list;
        }

        int preSum = 0;
        int nextSum = 1;
        list.add(1);

        for(int i=2;i<n;i++){

            int x = preSum + nextSum;
            list.add(x);
            preSum = nextSum;
            nextSum = x;

        }

        return list;

    }

    /*public static void main(String args[]){
        System.out.println(getFibSeries(10));
    }*/
}
