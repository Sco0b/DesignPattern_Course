package com.tetras;

public class SafetyCar {

    public static SafetyCar instance = new SafetyCar();

    public SafetyCar()
    {

    }

    public SafetyCar GetInstance()
    {
        return instance;
    }
}