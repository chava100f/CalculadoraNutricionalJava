package mx.chava100f.hibernate.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "medida")
public class Medida implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id_medida")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idMedida;

    @Column(name = "tipo_desc")
    private String tipoDesc;

    public Medida() {
        super();
    }

    public Medida(int idMedida, String tipoDesc) {
        super();
        this.idMedida = idMedida;
        this.tipoDesc = tipoDesc;
    }

    public Medida(String tipoDesc) {
        super();
        this.tipoDesc = tipoDesc;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getTipoDesc() {
        return tipoDesc;
    }

    public void setTipoDesc(String tipoDesc) {
        this.tipoDesc = tipoDesc;
    }

    @Override
    public String toString() {
        return "Medida{" +
                "idMedida=" + idMedida +
                ", tipoDesc='" + tipoDesc + '\'' +
                '}';
    }
}
