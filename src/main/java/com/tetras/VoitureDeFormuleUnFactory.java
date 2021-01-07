package com.tetras;

public class VoitureDeFormuleUnFactory {

    public static IVoitureDeFormuleUn getVoitureDeFormuleUn(Constructeur construct){
        if (Constructeur.MERCEDES.equals(construct))
            return new VoitureMercedes();
        else if (Constructeur.FERRARI.equals(construct))
            return new VoitureFerrari();
        else if (Constructeur.RENAULT.equals(construct))
            return new VoitureRenault();
        else
            throw new IllegalArgumentException();
    }
}
