package mx.chava100.hibernate.services;

import mx.chava100.hibernate.model.grupos.*;
import mx.chava100.hibernate.model.Plan;

import java.util.List;

public interface IGeneradorMenus {

    void generaMenu(Plan plan);
    void generaDesayuno();

    List<Frutas> obtieneFrutas(int numeroElementosPorObtener);
    List<Verduras> obtieneVerduras(int numeroElementosPorObtener);
    List<Lacteos> obtieneLacteos(int numeroElementosPorObtener);
    List<CerealesSinGrasa> obtieneCerealesSinGrasa(int numeroElementosPorObtener);
    List<AceitesGrasasConProteina> obtieneAceitesGrasasConProteina(int numeroElementosPorObtener);
    List<AceitesGrasasSinProteina> obtieneAceitesGrasasSinProteina(int numeroElementosPorObtener);
    List<AlimentosSinEnergia> obtieneAlimentosSinEnergia(int numeroElementosPorObtener);
    List<CarneBajaEnGrasa> obtieneCarneBajaEnGrasa(int numeroElementosPorObtener);
    List<CarneMuyBajaEnGrasa> obtieneCarneMuyBajaEnGrasa(int numeroElementosPorObtener);

    void muestraMenu();

}
