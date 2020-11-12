package mx.chava100.hibernate.model.plan;

public class EquivalenteGral {

    protected int cerealesYtuberculos;
    protected int verduras;
    protected int frutas;
    protected int aCarnesMuyBajasEnGrasa;
    protected int bCarnesBajasEnGrasa;
    protected int lacteos;
    protected int aceitesYgrasas;
    protected int aceitesYgrasasConProteina;
    protected int azucares;
    protected int alimentosSinEnergia;

    public EquivalenteGral() {
        this.cerealesYtuberculos = 5;
        this.verduras = 7;
        this.frutas = 2;
        this.aCarnesMuyBajasEnGrasa = 5;
        this.bCarnesBajasEnGrasa = 2;
        this.lacteos = 1;
        this.aceitesYgrasas = 4;
        this.aceitesYgrasasConProteina = 4;
        this.azucares = 1;
        this.alimentosSinEnergia = 0;

    }

    public int getCerealesYtuberculos() {
        return cerealesYtuberculos;
    }

    public void setCerealesYtuberculos(int cerealesYtuberculos) {
        this.cerealesYtuberculos = cerealesYtuberculos;
    }

    public int getVerduras() {
        return verduras;
    }

    public void setVerduras(int verduras) {
        this.verduras = verduras;
    }

    public int getFrutas() {
        return frutas;
    }

    public void setFrutas(int frutas) {
        this.frutas = frutas;
    }

    public int getaCarnesMuyBajasEnGrasa() {
        return aCarnesMuyBajasEnGrasa;
    }

    public void setaCarnesMuyBajasEnGrasa(int aCarnesMuyBajasEnGrasa) {
        this.aCarnesMuyBajasEnGrasa = aCarnesMuyBajasEnGrasa;
    }

    public int getbCarnesBajasEnGrasa() {
        return bCarnesBajasEnGrasa;
    }

    public void setbCarnesBajasEnGrasa(int bCarnesBajasEnGrasa) {
        this.bCarnesBajasEnGrasa = bCarnesBajasEnGrasa;
    }

    public int getAceitesYgrasas() {
        return aceitesYgrasas;
    }

    public void setAceitesYgrasas(int aceitesYgrasas) {
        this.aceitesYgrasas = aceitesYgrasas;
    }

    public int getAceitesYgrasasConProteina() {
        return aceitesYgrasasConProteina;
    }

    public void setAceitesYgrasasConProteina(int aceitesYgrasasConProteina) {
        aceitesYgrasasConProteina = aceitesYgrasasConProteina;
    }

    public int getAzucares() {
        return azucares;
    }

    public void setAzucares(int azucares) {
        this.azucares = azucares;
    }

    public int getLacteos() {
        return lacteos;
    }

    public void setLacteos(int lacteos) {
        this.lacteos = lacteos;
    }

    public int getAlimentosSinEnergia() {
        return alimentosSinEnergia;
    }

    public void setAlimentosSinEnergia(int alimentosSinEnergia) {
        this.alimentosSinEnergia = alimentosSinEnergia;
    }

    @Override
    public String toString() {
        return "EquivalenteGral{" +
                "cerealesYtuberculos=" + cerealesYtuberculos +
                ", verduras=" + verduras +
                ", frutas=" + frutas +
                ", aCarnesMuyBajasEnGrasa=" + aCarnesMuyBajasEnGrasa +
                ", bCarnesBajasEnGrasa=" + bCarnesBajasEnGrasa +
                ", aLecheDescremada=" + lacteos +
                ", aceitesYgrasas=" + aceitesYgrasas +
                ", aceitesYgrasasConProteina=" + aceitesYgrasasConProteina +
                ", azucares=" + azucares +
                ", alimentosSinEnergia=" + alimentosSinEnergia +
                '}';
    }
}
