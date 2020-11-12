package mx.chava100f.hibernate.util;

import mx.chava100f.hibernate.model.grupos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class GeneralUtils {

    public static List<Integer> generaNumerosAleatoriosConRepeticion(int maxElements, List<Integer> elementsList){

        List<Integer> respList  = new ArrayList<>();
        if(elementsList != null && elementsList.size() != 0 ){
            for(int i = 0; i < maxElements; i++) {
                Random r = new Random();
                int valorDado = r.nextInt(elementsList.size() == 0 ? elementsList.size() : elementsList.size() - 1); //Otiene numero random entre 0 y (tamanio lista - 1)
                respList.add(elementsList.get(valorDado));
            }
        }
        return respList;

    }

    public static <T> List<Integer> obtieneListaIds(List<T> list){

        List<Integer> respList  = new ArrayList<>();
        for(T element : list) {

            String claseT = element.getClass().toString();
            if(element instanceof Frutas){
                Frutas f = (Frutas) element;
                respList.add(f.getId());
            } else if(element instanceof Verduras){
                Verduras f = (Verduras) element;
                respList.add(f.getId());
            } else if(element instanceof Lacteos){
                Lacteos f = (Lacteos) element;
                respList.add(f.getId());
            } else if(element instanceof CerealesSinGrasa){
                CerealesSinGrasa f = (CerealesSinGrasa) element;
                respList.add(f.getId());
            } else if(element instanceof AceitesGrasasConProteina){
                AceitesGrasasConProteina f = (AceitesGrasasConProteina) element;
                respList.add(f.getId());
            } else if(element instanceof AceitesGrasasSinProteina){
                AceitesGrasasSinProteina f = (AceitesGrasasSinProteina) element;
                respList.add(f.getId());
            } else if(element instanceof AlimentosSinEnergia){
                AlimentosSinEnergia f = (AlimentosSinEnergia) element;
                respList.add(f.getId());
            } else if(element instanceof CarneBajaEnGrasa){
                CarneBajaEnGrasa f = (CarneBajaEnGrasa) element;
                respList.add(f.getId());
            } else if(element instanceof CarneMuyBajaEnGrasa){
                CarneMuyBajaEnGrasa f = (CarneMuyBajaEnGrasa) element;
                respList.add(f.getId());
            }

        }
        return respList;
    }
}
