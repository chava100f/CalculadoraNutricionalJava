package mx.chava100f.hibernate.model.plan;

public class Comida extends EquivalenteGral {

    public Comida() {
        this.cerealesYtuberculos = 2;
        this.verduras = 3;
        this.frutas = 0;
        this.aCarnesMuyBajasEnGrasa = 3;
        this.bCarnesBajasEnGrasa = 1;
        this.lacteos = 0;
        this.aceitesYgrasas = 2;
        this.aceitesYgrasasConProteina = 0;
        this.azucares = 0;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "cerealesYtuberculos=" + cerealesYtuberculos +
                ", verduras=" + verduras +
                ", frutas=" + frutas +
                ", aCarnesMuyBajasEnGrasa=" + aCarnesMuyBajasEnGrasa +
                ", bCarnesBajasEnGrasa=" + bCarnesBajasEnGrasa +
                ", aLecheDescremada=" + lacteos +
                ", aceitesYgrasas=" + aceitesYgrasas +
                ", aceitesYgrasasConProteina=" + aceitesYgrasasConProteina +
                ", azucares=" + azucares +
                '}';
    }

}
