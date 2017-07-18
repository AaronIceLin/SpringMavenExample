package com.aaron.app;

/**
 * Created by Aaron on 7/17/2017.
 */
public class Messager {
    private String message;
    private int index;

    public Messager(){

    }

    public Messager(String message){
        this.message = message;
    }

    public Messager(String message,int index){
        this.message = message;
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }

    public void printMessageWithIndex(){
        System.out.println("Message: "+message+" .Index: "+index);
    }
}
