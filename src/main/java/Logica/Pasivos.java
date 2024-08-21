
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pasivos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String Gabeta_pas;
    private int Caja_pas;
    private String Matricula_pas;
    private String Descripcion_pas;
    private int Cantidad_pas;

    public Pasivos() {
    }

    public Pasivos(int id, String Gabeta_pas, int Caja_pas, String Matricula_pas, String Descripcion_pas, int Cantidad_pas) {
        this.id = id;
        this.Gabeta_pas = Gabeta_pas;
        this.Caja_pas = Caja_pas;
        this.Matricula_pas = Matricula_pas;
        this.Descripcion_pas = Descripcion_pas;
        this.Cantidad_pas = Cantidad_pas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabeta_pas() {
        return Gabeta_pas;
    }

    public void setGabeta_pas(String Gabeta_pas) {
        this.Gabeta_pas = Gabeta_pas;
    }

    public int getCaja_pas() {
        return Caja_pas;
    }

    public void setCaja_pas(int Caja_pas) {
        this.Caja_pas = Caja_pas;
    }

    public String getMatricula_pas() {
        return Matricula_pas;
    }

    public void setMatricula_pas(String Matricula_pas) {
        this.Matricula_pas = Matricula_pas;
    }

    public String getDescripcion_pas() {
        return Descripcion_pas;
    }

    public void setDescripcion_pas(String Descripcion_pas) {
        this.Descripcion_pas = Descripcion_pas;
    }

    public int getCantidad_pas() {
        return Cantidad_pas;
    }

    public void setCantidad_pas(int Cantidad_pas) {
        this.Cantidad_pas = Cantidad_pas;
    }
    
    
}

