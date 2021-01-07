package com.tetras;

import java.util.ArrayList;

public class CircuitDeCourse {

    private SafetyCar safetyCar;
    private ArrayList<VoitureParticipante> voitures;
    
    public CircuitDeCourse()
    {
        safetyCar = SafetyCar.getInstance();
        voitures = new ArrayList<>();
    }
}