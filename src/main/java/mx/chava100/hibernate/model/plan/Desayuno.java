package mx.chava100.hibernate.model.plan;

import mx.chava100.hibernate.model.grupos.*;

import java.util.List;

public class Desayuno extends EquivalenteGral{

    private List<Frutas> listaFrutas;
    private List<Verduras> listaVerduras;
    private List<Lacteos> listaLacteos;
    private List<CerealesSinGrasa> listaCerealesSinGrasa;
    private List<AceitesGrasasConProteina> listaAceitesGrasasConProteina;
    private List<AceitesGrasasSinProteina> listaAceitesGrasasSinProteina;
    private List<AlimentosSinEnergia> listaAlimentosSinEnergia;
    private List<CarneBajaEnGrasa> listaCarneBajaEnGrasa;
    private List<CarneMuyBajaEnGrasa> listaCarneMuyBajaEnGrasa;



    public Desayuno() {
        this.cerealesYtuberculos = 1;
        this.verduras = 1;
        this.frutas = 1;
        this.aCarnesMuyBajasEnGrasa = 1;
        this.bCarnesBajasEnGrasa = 1;
        this.lacteos = 1;
        this.aceitesYgrasas = 1;
        this.aceitesYgrasasConProteina = 1;
        this.azucares = 1;
        this.alimentosSinEnergia = 1;
    }

    public List<Frutas> getListaFrutas() {
        return listaFrutas;
    }

    public void setListaFrutas(List<Frutas> listaFrutas) {
        this.listaFrutas = listaFrutas;
    }

    public List<Verduras> getListaVerduras() {
        return listaVerduras;
    }

    public void setListaVerduras(List<Verduras> listaVerduras) {
        this.listaVerduras = listaVerduras;
    }

    public List<Lacteos> getListaLacteos() {
        return listaLacteos;
    }

    public void setListaLacteos(List<Lacteos> listaLacteos) {
        this.listaLacteos = listaLacteos;
    }

    public List<CerealesSinGrasa> getListaCerealesSinGrasa() {
        return listaCerealesSinGrasa;
    }

    public void setListaCerealesSinGrasa(List<CerealesSinGrasa> listaCerealesSinGrasa) {
        this.listaCerealesSinGrasa = listaCerealesSinGrasa;
    }

    public List<AceitesGrasasConProteina> getListaAceitesGrasasConProteina() {
        return listaAceitesGrasasConProteina;
    }

    public void setListaAceitesGrasasConProteina(List<AceitesGrasasConProteina> listaAceitesGrasasConProteina) {
        this.listaAceitesGrasasConProteina = listaAceitesGrasasConProteina;
    }

    public List<AceitesGrasasSinProteina> getListaAceitesGrasasSinProteina() {
        return listaAceitesGrasasSinProteina;
    }

    public void setListaAceitesGrasasSinProteina(List<AceitesGrasasSinProteina> listaAceitesGrasasSinProteina) {
        this.listaAceitesGrasasSinProteina = listaAceitesGrasasSinProteina;
    }

    public List<AlimentosSinEnergia> getListaAlimentosSinEnergia() {
        return listaAlimentosSinEnergia;
    }

    public void setListaAlimentosSinEnergia(List<AlimentosSinEnergia> listaAlimentosSinEnergia) {
        this.listaAlimentosSinEnergia = listaAlimentosSinEnergia;
    }

    public List<CarneBajaEnGrasa> getListaCarneBajaEnGrasa() {
        return listaCarneBajaEnGrasa;
    }

    public void setListaCarneBajaEnGrasa(List<CarneBajaEnGrasa> listaCarneBajaEnGrasa) {
        this.listaCarneBajaEnGrasa = listaCarneBajaEnGrasa;
    }

    public List<CarneMuyBajaEnGrasa> getListaCarneMuyBajaEnGrasa() {
        return listaCarneMuyBajaEnGrasa;
    }

    public void setListaCarneMuyBajaEnGrasa(List<CarneMuyBajaEnGrasa> listaCarneMuyBajaEnGrasa) {
        this.listaCarneMuyBajaEnGrasa = listaCarneMuyBajaEnGrasa;
    }

    @Override
    public String toString() {
        return "Desayuno{" +
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

