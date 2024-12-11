package com.example.java_switch;

public class browese_switch {
    public static void main(String[] args) {
        String browser="firefox";
        switch (browser){
            case "chrome":
                System.out.println("chrome browser is started");
                break;
            case "firefox":
                System.out.println("firefox is started");
                break;
            case "edge":
                System.out.println("edge is started");
                break;
            default:
                System.out.println("invail data ");
        }
    }
}
