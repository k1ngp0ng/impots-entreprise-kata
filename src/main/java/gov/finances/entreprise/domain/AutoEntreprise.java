package gov.finances.entreprise.domain;

public class AutoEntreprise extends Entreprise {

    public AutoEntreprise(String siret, String denomination) {
        super(siret, denomination, TypeEntreprise.AUTOENTREPRISE);
    }

    @Override
    public Double tauxImposition() {
        return 0.25d;
    }
}
