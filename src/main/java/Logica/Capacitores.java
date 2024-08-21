
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Capacitores implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String Gabeta_Cap;
    private int Caja_Cap;
    private String Matricula_Cap;
    private String Voltaje_Cap;
    private int Cantidad_Cap;
    private String Caracteristica_Cap;

    public Capacitores() {
    }

    public Capacitores(int id, String Gabeta_Cap, int Caja_Cap, String Matricula_Cap, String Voltaje_Cap, int Cantidad_Cap, String Caracteristica_Cap) {
        this.id = id;
        this.Gabeta_Cap = Gabeta_Cap;
        this.Caja_Cap = Caja_Cap;
        this.Matricula_Cap = Matricula_Cap;
        this.Voltaje_Cap = Voltaje_Cap;
        this.Cantidad_Cap = Cantidad_Cap;
        this.Caracteristica_Cap = Caracteristica_Cap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabeta_Cap() {
        return Gabeta_Cap;
    }

    public void setGabeta_Cap(String Gabeta_Cap) {
        this.Gabeta_Cap = Gabeta_Cap;
    }

    public int getCaja_Cap() {
        return Caja_Cap;
    }

    public void setCaja_Cap(int Caja_Cap) {
        this.Caja_Cap = Caja_Cap;
    }

    public String getMatricula_Cap() {
        return Matricula_Cap;
    }

    public void setMatricula_Cap(String Matricula_Cap) {
        this.Matricula_Cap = Matricula_Cap;
    }

    public String getVoltaje_Cap() {
        return Voltaje_Cap;
    }

    public void setVoltaje_Cap(String Voltaje_Cap) {
        this.Voltaje_Cap = Voltaje_Cap;
    }

    public int getCantidad_Cap() {
        return Cantidad_Cap;
    }

    public void setCantidad_Cap(int Cantidad_Cap) {
        this.Cantidad_Cap = Cantidad_Cap;
    }

    public String getCaracteristica_Cap() {
        return Caracteristica_Cap;
    }

    public void setCaracteristica_Cap(String Caracteristica_Cap) {
        this.Caracteristica_Cap = Caracteristica_Cap;
    }
    
    
    
    
}
