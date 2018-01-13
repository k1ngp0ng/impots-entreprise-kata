package gov.finances.entreprise.domain;

public class SASEntreprise extends Entreprise {

    private final String adresseSiegeSocial;

    public SASEntreprise(String siret, String denomination, String adresseSiegeSocial) {
        super(siret, denomination, TypeEntreprise.SAS);
        this.adresseSiegeSocial = adresseSiegeSocial;
    }

    @Override
    public Double tauxImposition() {
        return 0.33d;
    }

    public String adresseSiegeSocial() {
        return adresseSiegeSocial;
    }
}
