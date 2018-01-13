package gov.finances.entreprise.domain;

import java.util.Objects;

public class Siret {

    private final String value;

    public Siret(String value) {
        validateSiret(value);
        this.value = value;
    }

    private void validateSiret(String value) {
        Objects.requireNonNull(value);
        if (value.isEmpty() || value.length() != 14) {
            throw new InvalidSiretException(String.format("Le siret '%s' n'est pas valide", value));
        }
    }

    public String value() {
        return value;
    }
}
