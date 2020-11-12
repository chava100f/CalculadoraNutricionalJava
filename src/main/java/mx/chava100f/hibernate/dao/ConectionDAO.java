package mx.chava100f.hibernate.dao;

import mx.chava100f.hibernate.model.grupos.*;
import mx.chava100f.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ConectionDAO {

    private static Transaction transaction = null;

    public static <T> void save(T obj){

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();

            session.save(obj);

            transaction.commit();

        }catch(Exception e){
            if(transaction != null){
                transaction.rollback();
            }
        }
    }

    public Frutas getFrutas(int id){

        Frutas respuesta = null;

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.getReference(Frutas.class, id); // session.load() for native Session API
            System.out.println("Fruta" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<Frutas> getAllFrutas(){

        List<Frutas> respuesta = new ArrayList<Frutas>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(Frutas.class).list(); // session.load() for native Session API
            //System.out.println("Fruta" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<Verduras> getAllVerduras(){

        List<Verduras> respuesta = new ArrayList<Verduras>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(Verduras.class).list(); // session.load() for native Session API
            //System.out.println("Verduras" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<Lacteos> getAllLacteos(){

        List<Lacteos> respuesta = new ArrayList<Lacteos>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(Lacteos.class).list(); // session.load() for native Session API
            //System.out.println("Lacteos" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<CerealesSinGrasa> getAllCerealesSinGrasa(){

        List<CerealesSinGrasa> respuesta = new ArrayList<CerealesSinGrasa>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(CerealesSinGrasa.class).list(); // session.load() for native Session API
            //System.out.println("CerealesSinGrasa" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<AceitesGrasasConProteina> getAllAceitesGrasasConProteina(){

        List<AceitesGrasasConProteina> respuesta = new ArrayList<AceitesGrasasConProteina>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(AceitesGrasasConProteina.class).list(); // session.load() for native Session API
            //System.out.println("AceitesGrasasConProteina" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<AceitesGrasasSinProteina> getAllAceitesGrasasSinProteina(){

        List<AceitesGrasasSinProteina> respuesta = new ArrayList<AceitesGrasasSinProteina>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(AceitesGrasasSinProteina.class).list(); // session.load() for native Session API
            //System.out.println("AceitesGrasasSinProteina" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<AlimentosSinEnergia> getAllAlimentosSinEnergia(){

        List<AlimentosSinEnergia> respuesta = new ArrayList<AlimentosSinEnergia>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(AlimentosSinEnergia.class).list(); // session.load() for native Session API
            //System.out.println("AlimentosSinEnergia" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<CarneBajaEnGrasa> getAllCarneBajaEnGrasa(){

        List<CarneBajaEnGrasa> respuesta = new ArrayList<CarneBajaEnGrasa>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(CarneBajaEnGrasa.class).list(); // session.load() for native Session API
            //System.out.println("CarneBajaEnGrasa" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }

    public List<CarneMuyBajaEnGrasa> getAllCarneMuyBajaEnGrasa(){

        List<CarneMuyBajaEnGrasa> respuesta = new ArrayList<CarneMuyBajaEnGrasa>();

        try(Session session = HibernateUtil.getSessionFact().openSession()){
            transaction = session.beginTransaction();
            respuesta = session.createCriteria(CarneMuyBajaEnGrasa.class).list(); // session.load() for native Session API
            //System.out.println("CarneBajaEnGrasa" + (respuesta != null ? respuesta.toString():"null"));
        }catch(Exception e){
            e.printStackTrace();
        }

        return respuesta;
    }
}
