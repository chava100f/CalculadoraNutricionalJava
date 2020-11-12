package mx.chava100f.hibernate.dao;

import mx.chava100f.hibernate.model.grupos.Frutas;
import mx.chava100f.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConectionDAOTest {
    public static Transaction transaction = null;

    @Test
    void getFrutas() {
        Frutas respuesta = null;

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.getReference(Frutas.class, 1); // session.load() for native Session API
            System.out.println("Fruta" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println((respuesta != null ? respuesta.toString():"null"));
    }
}