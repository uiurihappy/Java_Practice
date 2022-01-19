import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        int sum = 0, check = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 ==0) && (i % 5 == 0)) {
                sum += i;
                System.out.println("Found number = " + i);
                check++;
            }
            if(check == 10)
                break;
        }
        System.out.println("Sum = " + sum);
    }
}
