
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Varios implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String Gabeta_var;
    private int Caja_var;
    private String Matricula_var;
    private String Descripcion_var;
    private int Cantidad_var;

    public Varios() {
    }

    public Varios(int id, String Gabeta_var, int Caja_var, String Matricula_var, String Descripcion_var, int Cantidad_var) {
        this.id = id;
        this.Gabeta_var = Gabeta_var;
        this.Caja_var = Caja_var;
        this.Matricula_var = Matricula_var;
        this.Descripcion_var = Descripcion_var;
        this.Cantidad_var = Cantidad_var;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabeta_var() {
        return Gabeta_var;
    }

    public void setGabeta_var(String Gabeta_var) {
        this.Gabeta_var = Gabeta_var;
    }

    public int getCaja_var() {
        return Caja_var;
    }

    public void setCaja_var(int Caja_var) {
        this.Caja_var = Caja_var;
    }

    public String getMatricula_var() {
        return Matricula_var;
    }

    public void setMatricula_var(String Matricula_var) {
        this.Matricula_var = Matricula_var;
    }

    public String getDescripcion_var() {
        return Descripcion_var;
    }

    public void setDescripcion_var(String Descripcion_var) {
        this.Descripcion_var = Descripcion_var;
    }

    public int getCantidad_var() {
        return Cantidad_var;
    }

    public void setCantidad_var(int Cantidad_var) {
        this.Cantidad_var = Cantidad_var;
    }
    
    
}
