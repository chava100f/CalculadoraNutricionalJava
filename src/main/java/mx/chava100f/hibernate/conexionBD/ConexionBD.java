package mx.chava100f.hibernate.conexionBD;


import mx.chava100f.hibernate.model.Alimento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ConexionBD {

    private static EntityManager em;
    private static EntityManagerFactory emf;

    public ConexionBD() {
        ini_con();
    }

    public void ini_con(){
        try {
            emf = Persistence.createEntityManagerFactory("conexionMySQL");
            em = emf.createEntityManager();
        }catch(Exception e){
            System.out.println("Error al crear conexion con la base de datos MySQL");
            e.printStackTrace();
        }
    }

    public void close_con(){
        if(em != null || em.isOpen()){
            em.close();
        }
        if(emf != null || emf.isOpen()){
            emf.close();
        }
    }

    public List<Alimento> getAllAlimentos(){

        Alimento a = em.find(Alimento.class, 1);
        System.out.println("Alimento - " + a);

        return null;
    }

}
