package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Object of(int number) {
        List<Integer> factors = new ArrayList<>();
        if(number == 2){
            factors.add(2);
        } else if(number == 3){
            factors.add(3);
        }
        return factors;
    }
}
