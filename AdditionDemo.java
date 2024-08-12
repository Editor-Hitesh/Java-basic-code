package com.yogesh.task;
import java.util.Random;
 

public class AdditonUsingRecursion {
    
    public int add(int num)
    {
        if(num == 1)
            return 1 ;
        else
            return num + add(num-1);
    }
    
    public static void main(String args[])
    {
        Random random = new Random();

        AdditonUsingRecursion obj = new AdditonUsingRecursion();

        int num ;
        num = random.nextInt(99);
        System.out.println("Enter a number :" + num);
        
        int addtion = obj.add(num);
        System.out.println(addtion);

    }
}
