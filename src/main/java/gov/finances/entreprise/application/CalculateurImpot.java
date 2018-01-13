package gov.finances.entreprise.application;

import gov.finances.entreprise.domain.Entreprise;

public class CalculateurImpot {

    public Double calculerImpot(Entreprise entreprise, Double chiffreAffaire) {
        if (chiffreAffaire == null || chiffreAffaire.doubleValue() < 0 ) {
            throw new IllegalArgumentException(String.format("Chiffre d'affaire incorrect %s", chiffreAffaire));
        }
        return entreprise.tauxImposition() * chiffreAffaire;
    }
}
