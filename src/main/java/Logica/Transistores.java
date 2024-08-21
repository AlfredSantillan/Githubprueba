
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transistores implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String Gabtea_tra;
    private int Caja_tra;
    private String Matricula_tra;
    private String Caracteristicas_tra;
    private int Cantidad_tra;

    public Transistores() {
    }

    public Transistores(int id, String Gabtea_tra, int Caja_tra, String Matricula_tra, String Caracteristicas_tra, int Cantidad_tra) {
        this.id = id;
        this.Gabtea_tra = Gabtea_tra;
        this.Caja_tra = Caja_tra;
        this.Matricula_tra = Matricula_tra;
        this.Caracteristicas_tra = Caracteristicas_tra;
        this.Cantidad_tra = Cantidad_tra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabtea_tra() {
        return Gabtea_tra;
    }

    public void setGabtea_tra(String Gabtea_tra) {
        this.Gabtea_tra = Gabtea_tra;
    }

    public int getCaja_tra() {
        return Caja_tra;
    }

    public void setCaja_tra(int Caja_tra) {
        this.Caja_tra = Caja_tra;
    }

    public String getMatricula_tra() {
        return Matricula_tra;
    }

    public void setMatricula_tra(String Matricula_tra) {
        this.Matricula_tra = Matricula_tra;
    }

    public String getCaracteristicas_tra() {
        return Caracteristicas_tra;
    }

    public void setCaracteristicas_tra(String Caracteristicas_tra) {
        this.Caracteristicas_tra = Caracteristicas_tra;
    }

    public int getCantidad_tra() {
        return Cantidad_tra;
    }

    public void setCantidad_tra(int Cantidad_tra) {
        this.Cantidad_tra = Cantidad_tra;
    }
    
    
}
