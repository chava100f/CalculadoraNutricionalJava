package mx.chava100f.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "grupo_alimenticio")
public class GrupoAlimenticio {

    @Id
    @Column(name = "id_grupo_alimenticio")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idGrupoAlimenticio;

    @Column(name = "descripcion")
    private String descripcion;

    public GrupoAlimenticio() {
        super();
    }

    public GrupoAlimenticio(int idGrupoAlimenticio, String descripcion) {
        super();
        this.idGrupoAlimenticio = idGrupoAlimenticio;
        this.descripcion = descripcion;
    }

    public int getIdGrupoAlimenticio() {
        return idGrupoAlimenticio;
    }

    public void setIdGrupoAlimenticio(int idGrupoAlimenticio) {
        this.idGrupoAlimenticio = idGrupoAlimenticio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "GrupoAlimenticio{" +
                "idGrupoAlimenticio=" + idGrupoAlimenticio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
