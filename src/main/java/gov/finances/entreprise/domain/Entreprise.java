package gov.finances.entreprise.domain;

public abstract class Entreprise {

    private final Siret siret;
    private final String denomination;
    private final TypeEntreprise type;

    public Entreprise(String siret, String denomination, TypeEntreprise type) {
        this.siret = new Siret(siret);
        this.denomination = denomination;
        this.type = type;
    }

    public abstract Double tauxImposition();

    public Siret siret() {
        return siret;
    }

    public String denomination() {
        return denomination;
    }

    public TypeEntreprise type() {
        return type;
    }
}
