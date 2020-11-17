package mx.chava100f.hibernate.model;

import javax.persistence.*;


@Entity
@Table(name = "alimento")
public class Alimento {

    @Id
    @Column(name = "id_alimento")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAlimento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad")
    private Float cantidad;

    @ManyToOne(targetEntity = Medida.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medida", referencedColumnName = "id_medida")
    private Medida medida;

    @ManyToOne(targetEntity = GrupoAlimenticio.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_grupo_alimenticio", referencedColumnName = "id_grupo_alimenticio")
    private GrupoAlimenticio grupoAlimenticio;

    public Alimento() {
        super();
    }

    public Alimento(Integer idAlimento, String descripcion, Float cantidad, Medida medida, GrupoAlimenticio grupoAlimenticio) {
        super();
        this.idAlimento = idAlimento;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.medida = medida;
        this.grupoAlimenticio = grupoAlimenticio;
    }

    public Integer getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Integer idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public GrupoAlimenticio getGrupoAlimenticio() {
        return grupoAlimenticio;
    }

    public void setGrupoAlimenticio(GrupoAlimenticio grupoAlimenticio) {
        this.grupoAlimenticio = grupoAlimenticio;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "idAlimento=" + idAlimento +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", medida=" + medida +
                ", grupoAlimenticio=" + grupoAlimenticio +
                '}';
    }
}
