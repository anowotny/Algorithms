
package com.company.zad1.zad2;

import java.util.Collections;
import java.util.List;

public class Solution {

    int solution(List<Integer> a){
        int smallest=1;
        Collections.sort(a);
        for(Integer i : a){
            if(smallest==i )
                smallest++;
        }
        return smallest;

    }
}
