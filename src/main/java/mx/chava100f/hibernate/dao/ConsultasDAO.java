package mx.chava100f.hibernate.dao;

import mx.chava100f.hibernate.dao.interfaces.IConsultasDAO;
import mx.chava100f.hibernate.model.Alimento;
import mx.chava100f.hibernate.model.GrupoAlimenticio;
import mx.chava100f.hibernate.model.Medida;

import java.util.List;

public class ConsultasDAO implements IConsultasDAO {

    public ConsultasDAO() {

    }

    @Override
    public Alimento getAlimentoById(int id) {
        return null;
    }

    @Override
    public Medida getMedidaById(int id) {
        return null;
    }

    @Override
    public GrupoAlimenticio getGrupoAlimenticioById(int id) {
        return null;
    }

    @Override
    public List<Alimento> getAllAlimentos() {
        return null;
    }

    @Override
    public List<Medida> getAllMedidas() {
        return null;
    }

    @Override
    public List<GrupoAlimenticio> getAllGruposAlimenticios() {
        return null;
    }
}
