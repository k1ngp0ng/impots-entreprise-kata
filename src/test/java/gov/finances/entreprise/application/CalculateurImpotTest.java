package gov.finances.entreprise.application;

import gov.finances.entreprise.domain.AutoEntreprise;
import gov.finances.entreprise.domain.SASEntreprise;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculateurImpotTest {

    private AutoEntreprise autoEntreprise;
    private SASEntreprise sasEntreprise;
    private CalculateurImpot calculateurImpot;

    @Before
    public void init() {
        this.autoEntreprise = new AutoEntreprise("AUTO1234567890", "AutoEntreprise");
        this.sasEntreprise = new SASEntreprise("SAS12345678910", "SasEntreprise", "12 rue de la présipauté, Groland");
        this.calculateurImpot = new CalculateurImpot();

    }

    @Test
    public void calculer_impot_autoentreprise_doit_donner_le_bon_taux() {
        Assertions.assertThat(calculateurImpot.calculerImpot(autoEntreprise, 100000d)).isEqualTo(25000);

        Assertions.assertThat(calculateurImpot.calculerImpot(autoEntreprise, 123456d)).isEqualTo(30864);

    }

    @Test
    public void calculer_impot_sasentreprise_doit_donner_le_bon_taux() {
        Assertions.assertThat(calculateurImpot.calculerImpot(sasEntreprise, 100000d)).isEqualTo(33000);

        Assertions.assertThat(calculateurImpot.calculerImpot(sasEntreprise, 123456d)).isEqualTo(40740.48);

        Assertions.assertThat(calculateurImpot.calculerImpot(sasEntreprise, 123456.7891d)).isEqualTo(40740.740403);
    }
}
