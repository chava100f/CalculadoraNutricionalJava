package mx.chava100f.hibernate.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "medidas")
public class Medidas implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id_medida")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_medidas1")
    @SequenceGenerator(name="seq_medidas1", sequenceName = "seq_medidas",allocationSize=1)
    private int idMedida;

    @Column(name = "tipo_medida")
    private String tipoMedida;

    public Medidas() {
        super();
    }
    public Medidas(int idMedida, String tipoMedida) {
        super();
        this.idMedida = idMedida;
        this.tipoMedida = tipoMedida;
    }

    public Medidas(String tipoMedida) {
        super();
        this.tipoMedida = tipoMedida;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getTipoMedida() {
        return tipoMedida;
    }

    public void setTipoMedida(String tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    @Override
    public String toString() {
        return "Medidas{" +
                "idMedida=" + idMedida +
                ", tipoMedida='" + tipoMedida + '\'' +
                '}';
    }
}
