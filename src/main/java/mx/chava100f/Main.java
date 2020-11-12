package mx.chava100f;

import mx.chava100.hibernate.dao.ConectionDAO;
import mx.chava100.hibernate.model.Plan;
import mx.chava100.hibernate.model.grupos.Frutas;
import mx.chava100.hibernate.model.Medidas;
import mx.chava100.hibernate.services.GeneradorMenus;

import java.util.List;

public class Main {

    public static void main(String[] args){

        System.out.println("BIENVENIDO AL GENERADOR DE MENUS AUTOMATICO 100F");
        System.out.println("Un momento en lo que se genera su menu...");

        ConectionDAO con = new ConectionDAO();
        /*Medidas medidas = new Medidas("PRUEBA");*/
        /*con.save(medidas);*/

        GeneradorMenus generador = new GeneradorMenus();
        Plan planHipoCalorico1500kCal = new Plan();
        generador.generaMenu(planHipoCalorico1500kCal);


        System.out.println("FIN DEL GENERADOR, BUEN DIA...");
    }
}

