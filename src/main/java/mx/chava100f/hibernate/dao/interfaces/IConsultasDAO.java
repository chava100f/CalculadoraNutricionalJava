package mx.chava100f.hibernate.dao.interfaces;

import mx.chava100f.hibernate.model.Alimento;
import mx.chava100f.hibernate.model.GrupoAlimenticio;
import mx.chava100f.hibernate.model.Medida;

import java.util.List;

public interface IConsultasDAO {

    Alimento getAlimentoById(int id);

    Medida getMedidaById(int id);

    GrupoAlimenticio getGrupoAlimenticioById(int id);

    List<Alimento> getAllAlimentos();

    List<Medida> getAllMedidas();

    List<GrupoAlimenticio> getAllGruposAlimenticios();
}
