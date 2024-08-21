
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arnes implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int id;
    
    int NumBol;
    String Descripcion;

    public Arnes() {
    }

    public Arnes(int id, int NumBol, String Descripcion) {
        this.id = id;
        this.NumBol = NumBol;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumBol() {
        return NumBol;
    }

    public void setNumBol(int NumBol) {
        this.NumBol = NumBol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
