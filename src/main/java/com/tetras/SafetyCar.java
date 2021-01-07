package com.tetras;

public class SafetyCar {

    public static final SafetyCar instance = new SafetyCar();

    private SafetyCar()
    {
        //Singleton non instanciable via constructeur
    }

    public static SafetyCar getInstance()
    {
        return instance;
    }
}