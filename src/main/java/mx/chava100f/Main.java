package mx.chava100f;

import mx.chava100f.hibernate.conexionBD.ConexionBD;
import mx.chava100f.hibernate.dao.ConectionDAO;
import mx.chava100f.hibernate.model.Alimento;
import mx.chava100f.hibernate.model.Plan;
import mx.chava100f.hibernate.services.GeneradorMenus;

import java.util.List;

public class Main {

    public static void main(String[] args){

        System.out.println("BIENVENIDO AL GENERADOR DE MENUS AUTOMATICO 100F");
        System.out.println("Un momento en lo que se genera su menu...");

        /*ConectionDAO con = new ConectionDAO();*/
        /*Medidas medidas = new Medidas("PRUEBA");*/
        /*con.save(medidas);*/

        /*GeneradorMenus generador = new GeneradorMenus();
        Plan planHipoCalorico1500kCal = new Plan();
        generador.generaMenu(planHipoCalorico1500kCal);*/

        ConexionBD cn = new ConexionBD();

        cn.getAllMedidas();
        cn.close_con();


        System.out.println("FIN DEL GENERADOR, BUEN DIA...");
    }
}

