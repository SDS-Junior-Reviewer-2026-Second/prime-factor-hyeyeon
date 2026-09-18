package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Object of(int number) {
        List<Integer> factors = new ArrayList<>();
        if(number > 1){
            factors.add(number);
        }
        return factors;
    }
}
