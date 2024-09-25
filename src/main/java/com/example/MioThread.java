package com.example;

public class MioThread implements Runnable{
    int l;
    public MioThread(int p1){
        l = p1;
    }
    public void run(){
        for(int i = 0; i < l; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
        
    }
}
