package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Object of(int number) {
        List<Integer> factors = new ArrayList<>();
        if(number > 1){
            int divisor = 2;
            if(number == 4) {
                while(number % divisor == 0) {
                    factors.add(divisor);
                    number /= divisor;
                }
            } else if(number == 6) {
                while(number % divisor == 0){
                    factors.add(divisor);
                    number /= divisor;
                }
                divisor++;
                while(number % divisor == 0){
                    factors.add(divisor);
                    number /= divisor;
                }
                divisor++;
            }
            else {
                factors.add(number);
            }
        }
        return factors;
    }
}
