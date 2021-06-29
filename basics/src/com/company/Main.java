package com.company;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(3);
        clock();
    }

    public static String pluralize(String name,  int number){
        if (number==1) {
            name=name;
        }else if(number==0 || number>1 )
        {name=name+"s";

        }

        return name;
    }



    public static void flipNHeads(int num){
        int flip =0;
        int min =0;
        int max=1;
        int count=0;
        while(count<num){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(random_int<0.5){
                System.out.println("tails");
                flip++;
            }else if(random_int>=0.5){
                System.out.println("HEADS");
                flip++;
                count++;
            }
        };
        System.out.println("It took"+ flip +"flips to flip" + count +"heads in a row.");
    };

    public static void clock (){
        int currentsec=0;
        while(true){
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(currentsec!=second);
            System.out.println(time);
            currentsec=second;
        }
    }

}
