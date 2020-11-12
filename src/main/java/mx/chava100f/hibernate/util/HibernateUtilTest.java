package mx.chava100f.hibernate.util;

import mx.chava100f.hibernate.model.grupos.Frutas;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HibernateUtilTest {

    private static Transaction transaction = null;

    @Test
    void setSession() {

        List<Frutas> respuesta = new ArrayList<Frutas>();

        try (Session session = HibernateUtil.getSessionFact().openSession()) {
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(Frutas.class).list(); // session.load() for native Session API
            //System.out.println("Fruta" + (respuesta != null ? respuesta.toString():"null"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}