package mx.chava100f.hibernate.model.plan;

public class Cena extends EquivalenteGral{

    public Cena() {
        this.cerealesYtuberculos = 1;
        this.verduras = 2;
        this.frutas = 0;
        this.aCarnesMuyBajasEnGrasa = 2;
        this.bCarnesBajasEnGrasa = 1;
        this.lacteos = 0;
        this.aceitesYgrasas = 2;
        this.aceitesYgrasasConProteina = 1;
        this.azucares = 0;
    }

    @Override
    public String toString() {
        return "Cena{" +
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
