package mx.chava100f.hibernate.model.plan;

public class Colacion1 extends EquivalenteGral{

    public Colacion1() {
        this.cerealesYtuberculos = 0;
        this.verduras = 2;
        this.frutas = 1;
        this.aCarnesMuyBajasEnGrasa = 0;
        this.bCarnesBajasEnGrasa = 0;
        this.lacteos = 0;
        this.aceitesYgrasas = 0;
        this.aceitesYgrasasConProteina = 1;
        this.azucares = 0;
    }

    @Override
    public String toString() {
        return "Colacion1{" +
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
