package mx.chava100.hibernate.model.plan;

public class Colacion2 extends EquivalenteGral{

    public Colacion2() {
        this.cerealesYtuberculos = 1;
        this.verduras = 0;
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
        return "Colacion2{" +
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
