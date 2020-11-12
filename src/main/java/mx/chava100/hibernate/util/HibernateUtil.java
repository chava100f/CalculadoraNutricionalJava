package mx.chava100.hibernate.util;

import mx.chava100.hibernate.model.grupos.*;
import mx.chava100.hibernate.model.Medidas;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory sessionFact;

    public static SessionFactory getSessionFact(){

        if(sessionFact == null){

            try{
                Configuration config = new Configuration();

                Properties prop = new Properties();
                prop.put(Environment.DRIVER, "org.postgresql.Driver");
                prop.put(Environment.URL, "jdbc:postgresql://localhost:5432/nutritionalAutoSchedule");
                prop.put(Environment.USER, "postgres");
                prop.put(Environment.PASS, "root");
                prop.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect");

                prop.put(Environment.SHOW_SQL, "true");
                prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");


                config.setProperties(prop);
                config.addAnnotatedClass(Medidas.class);
                config.addAnnotatedClass(Frutas.class);
                config.addAnnotatedClass(Verduras.class);
                config.addAnnotatedClass(Lacteos.class);
                config.addAnnotatedClass(CerealesSinGrasa.class);
                config.addAnnotatedClass(AceitesGrasasConProteina.class);
                config.addAnnotatedClass(AceitesGrasasSinProteina.class);
                config.addAnnotatedClass(AlimentosSinEnergia.class);
                config.addAnnotatedClass(CarneBajaEnGrasa.class);
                config.addAnnotatedClass(CarneMuyBajaEnGrasa.class);


                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

                sessionFact = config.buildSessionFactory(serviceRegistry);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return sessionFact;
    }
}
