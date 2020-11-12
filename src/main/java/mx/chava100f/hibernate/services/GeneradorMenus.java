package mx.chava100f.hibernate.services;

import mx.chava100f.hibernate.dao.ConectionDAO;
import mx.chava100f.hibernate.model.Plan;
import mx.chava100f.hibernate.model.grupos.*;
import mx.chava100f.hibernate.model.plan.Desayuno;
import mx.chava100f.hibernate.util.GeneralUtils;

import java.util.ArrayList;
import java.util.List;

public class GeneradorMenus implements IGeneradorMenus {

    private Plan plan;

    @Override
    public void generaMenu(Plan plan) {
        this.plan = plan;
        //TODO obtiene articulos existentes en despensa
        this.generaDesayuno();
        //TODO generaColacion1
        //TODO generaComida
        //TODO generaColacion2
        //TODO generaCena
        this.muestraMenu();
    }

    @Override
    public void generaDesayuno() {

        List<Frutas> listaFrutas = this.obtieneFrutas(plan.getDesayuno().getFrutas());
        List<Verduras> listaVerduras = this.obtieneVerduras(plan.getDesayuno().getVerduras());
        List<Lacteos> listaLacteos = this.obtieneLacteos(plan.getDesayuno().getLacteos());
        List<CerealesSinGrasa> listaCerealesSinGrasa = this.obtieneCerealesSinGrasa(plan.getDesayuno().getCerealesYtuberculos());
        List<AceitesGrasasConProteina> listaAceitesGrasasConProteina = this.obtieneAceitesGrasasConProteina(plan.getDesayuno().getAceitesYgrasasConProteina());
        List<AceitesGrasasSinProteina> listaAceitesGrasasSinProteina = this.obtieneAceitesGrasasSinProteina(plan.getDesayuno().getAceitesYgrasas());
        List<AlimentosSinEnergia> listaAlimentosSinEnergia = this.obtieneAlimentosSinEnergia(plan.getDesayuno().getAlimentosSinEnergia());
        List<CarneBajaEnGrasa> listaCarneBajaEnGrasa = this.obtieneCarneBajaEnGrasa(plan.getDesayuno().getbCarnesBajasEnGrasa());
        List<CarneMuyBajaEnGrasa> listaCarneMuyBajaEnGrasa = this.obtieneCarneMuyBajaEnGrasa(plan.getDesayuno().getaCarnesMuyBajasEnGrasa());


        Desayuno desayuno = new Desayuno();
        desayuno.setListaFrutas(listaFrutas);
        desayuno.setListaVerduras(listaVerduras);
        desayuno.setListaLacteos(listaLacteos);
        desayuno.setListaCerealesSinGrasa(listaCerealesSinGrasa);
        desayuno.setListaAceitesGrasasConProteina(listaAceitesGrasasConProteina);
        desayuno.setListaAceitesGrasasSinProteina(listaAceitesGrasasSinProteina);
        desayuno.setListaAlimentosSinEnergia(listaAlimentosSinEnergia);
        desayuno.setListaCarneBajaEnGrasa(listaCarneBajaEnGrasa);
        desayuno.setListaCarneMuyBajaEnGrasa(listaCarneMuyBajaEnGrasa);

        plan.setDesayuno(desayuno);

    }

    @Override
    public List<Frutas> obtieneFrutas(int numeroElementosPorObtener) {

        List<Frutas> listaFrutasGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las frutas
        List<Frutas> listaFrutas = con.getAllFrutas();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaFrutas);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsFrutas = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsFrutas)
            listaFrutasGenerada.add(listaFrutas.get(i));


        return listaFrutasGenerada;
    }

    @Override
    public List<Verduras> obtieneVerduras(int numeroElementosPorObtener) {

        List<Verduras> listaVerdurasGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las Verduras
        List<Verduras> listaVerduras = con.getAllVerduras();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaVerduras);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsVerduras = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsVerduras)
            listaVerdurasGenerada.add(listaVerduras.get(i));


        return listaVerdurasGenerada;
    }

    @Override
    public List<Lacteos> obtieneLacteos(int numeroElementosPorObtener) {

        List<Lacteos> listaLacteosGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las Lacteos
        List<Lacteos> listaLacteos = con.getAllLacteos();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaLacteos);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsLacteos = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsLacteos)
            listaLacteosGenerada.add(listaLacteos.get(i));


        return listaLacteosGenerada;
    }

    @Override
    public List<CerealesSinGrasa> obtieneCerealesSinGrasa(int numeroElementosPorObtener) {

        List<CerealesSinGrasa> listaCerealesSinGrasaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las cerealesSinGrasa
        List<CerealesSinGrasa> listaCerealesSinGrasa = con.getAllCerealesSinGrasa();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaCerealesSinGrasa);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsCerealesSinGrasa = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsCerealesSinGrasa)
            listaCerealesSinGrasaGenerada.add(listaCerealesSinGrasa.get(i));


        return listaCerealesSinGrasaGenerada;
    }

    @Override
    public List<AceitesGrasasConProteina> obtieneAceitesGrasasConProteina(int numeroElementosPorObtener) {

        List<AceitesGrasasConProteina> listaAceitesGrasasConProteinaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las AceitesGrasasConProteina
        List<AceitesGrasasConProteina> listaAceitesGrasasConProteina = con.getAllAceitesGrasasConProteina();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaAceitesGrasasConProteina);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsAceitesGrasasConProteina = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsAceitesGrasasConProteina)
            listaAceitesGrasasConProteinaGenerada.add(listaAceitesGrasasConProteina.get(i));


        return listaAceitesGrasasConProteinaGenerada;
    }

    @Override
    public List<AceitesGrasasSinProteina> obtieneAceitesGrasasSinProteina(int numeroElementosPorObtener) {

        List<AceitesGrasasSinProteina> listaAceitesGrasasSinProteinaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las AceitesGrasasConProteina
        List<AceitesGrasasSinProteina> listaAceitesGrasasSinProteina = con.getAllAceitesGrasasSinProteina();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaAceitesGrasasSinProteina);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsAceitesGrasasSinProteina = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsAceitesGrasasSinProteina)
            listaAceitesGrasasSinProteinaGenerada.add(listaAceitesGrasasSinProteina.get(i));


        return listaAceitesGrasasSinProteinaGenerada;
    }

    @Override
    public List<AlimentosSinEnergia> obtieneAlimentosSinEnergia(int numeroElementosPorObtener) {

        List<AlimentosSinEnergia> listaAlimentosSinEnergiaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las AceitesGrasasConProteina
        List<AlimentosSinEnergia> listaAlimentosSinEnergia = con.getAllAlimentosSinEnergia();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaAlimentosSinEnergia);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsAlimentosSinEnergia = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsAlimentosSinEnergia)
            listaAlimentosSinEnergiaGenerada.add(listaAlimentosSinEnergia.get(i));


        return listaAlimentosSinEnergiaGenerada;
    }

    @Override
    public List<CarneBajaEnGrasa> obtieneCarneBajaEnGrasa(int numeroElementosPorObtener) {

        List<CarneBajaEnGrasa> listaCarneBajaEnGrasaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las AceitesGrasasConProteina
        List<CarneBajaEnGrasa> listaCarneBajaEnGrasa = con.getAllCarneBajaEnGrasa();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaCarneBajaEnGrasa);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsCarneBajaEnGrasa = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsCarneBajaEnGrasa)
            listaCarneBajaEnGrasaGenerada.add(listaCarneBajaEnGrasa.get(i));


        return listaCarneBajaEnGrasaGenerada;
    }

    @Override
    public List<CarneMuyBajaEnGrasa> obtieneCarneMuyBajaEnGrasa(int numeroElementosPorObtener) {

        List<CarneMuyBajaEnGrasa> listaCarneMuyBajaEnGrasaGenerada = new ArrayList<>();

        ConectionDAO con = new ConectionDAO();
        //Obtiene de la BD todas las AceitesGrasasConProteina
        List<CarneMuyBajaEnGrasa> listaCarneMuyBajaEnGrasa = con.getAllCarneMuyBajaEnGrasa();

        //Obtiene la lista de ids para despues generar el menu
        List<Integer> elementsList = GeneralUtils.obtieneListaIds(listaCarneMuyBajaEnGrasa);

        //Genera una lista de ids alazar para despues generar el menu
        List<Integer> listaIdsCarneMuyBajaEnGrasa = GeneralUtils.generaNumerosAleatoriosConRepeticion(numeroElementosPorObtener, elementsList);

        for(Integer i : listaIdsCarneMuyBajaEnGrasa)
            listaCarneMuyBajaEnGrasaGenerada.add(listaCarneMuyBajaEnGrasa.get(i));


        return listaCarneMuyBajaEnGrasaGenerada;
    }

    @Override
    public void muestraMenu(){

        System.out.println("-----------------------MENU-----------------------");
        if(plan.getDesayuno() != null){
            System.out.println("******DESAYUNO:");
            if(plan.getDesayuno().getListaFrutas() != null)
                for(Frutas f : plan.getDesayuno().getListaFrutas()){
                    System.out.println(f.toString());
                }
            if(plan.getDesayuno().getListaVerduras() != null)
                for(Verduras v : plan.getDesayuno().getListaVerduras()){
                    System.out.println(v.toString());
                }
            if(plan.getDesayuno().getListaLacteos() != null)
                for(Lacteos l : plan.getDesayuno().getListaLacteos()){
                    System.out.println(l.toString());
                }
            if(plan.getDesayuno().getListaCerealesSinGrasa() != null)
                for(CerealesSinGrasa x : plan.getDesayuno().getListaCerealesSinGrasa()){
                    System.out.println(x.toString());
                }
            if(plan.getDesayuno().getListaAceitesGrasasConProteina() != null)
                for(AceitesGrasasConProteina x : plan.getDesayuno().getListaAceitesGrasasConProteina()){
                    System.out.println(x.toString());
                }
            if(plan.getDesayuno().getListaAceitesGrasasSinProteina() != null)
                for(AceitesGrasasSinProteina x : plan.getDesayuno().getListaAceitesGrasasSinProteina()){
                    System.out.println(x.toString());
                }
            if(plan.getDesayuno().getListaAlimentosSinEnergia() != null)
                for(AlimentosSinEnergia x : plan.getDesayuno().getListaAlimentosSinEnergia()){
                    System.out.println(x.toString());
                }
            if(plan.getDesayuno().getListaCarneBajaEnGrasa() != null)
                for(CarneBajaEnGrasa x : plan.getDesayuno().getListaCarneBajaEnGrasa()){
                    System.out.println(x.toString());
                }
            if(plan.getDesayuno().getListaCarneMuyBajaEnGrasa() != null)
                for(CarneMuyBajaEnGrasa x : plan.getDesayuno().getListaCarneMuyBajaEnGrasa()){
                    System.out.println(x.toString());
                }
        }

    }
}
