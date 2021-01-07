package com.tetras;

import java.util.ArrayList;

public class CircuitDeCourse {

    private SafetyCar safetyCar;
    private ArrayList<IVoitureDeFormuleUn> voitures;
    
    public CircuitDeCourse()
    {
        safetyCar = SafetyCar.getInstance();
        voitures = new ArrayList<>();
    }

    public void AddVoitureACourse(IVoitureDeFormuleUn voiture)
    {
        voitures.add(voiture);
    }

    public int GetNbVoitures()
    {
        return voitures.size();
    }
    
}