package fr.myt.learning.companions;

public class Singleton {

    private static Singleton SINGLETON;

    private Singleton() {
    }

    //BE CAREFUL MULTITHREADING NOT SAFE
    public static Singleton getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }
}
