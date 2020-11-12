package mx.chava100f.hibernate.model.grupos;

import mx.chava100f.hibernate.model.Medidas;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "verduras")
public class Verduras  implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "imagen")
    private String imagen;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medida", referencedColumnName = "id_medida")
    private Medidas medidas;

    public Verduras(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Verduras{" +
                "id=" + id +
                ", cantidad='" + cantidad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", medidas=" + medidas.toString() +
                "}";
    }
}
