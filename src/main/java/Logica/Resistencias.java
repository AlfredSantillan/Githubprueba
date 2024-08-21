
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resistencias implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String Gabeta_Res;
    private int Caja_Res;
    private String Seccion_Res;
    private String Matricula;
    private String Descripcion_Res;
    private int Cantidad_Res;

    public Resistencias() {
    }
    

    public Resistencias(int id, String Gabeta_Res, int Caja_Res, String Seccion_Res, String Matricula, String Descripcion_Res, int Cantidad_Res) {
        this.id = id;
        this.Gabeta_Res = Gabeta_Res;
        this.Caja_Res = Caja_Res;
        this.Seccion_Res = Seccion_Res;
        this.Matricula = Matricula;
        this.Descripcion_Res = Descripcion_Res;
        this.Cantidad_Res = Cantidad_Res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabeta_Res() {
        return Gabeta_Res;
    }

    public void setGabeta_Res(String Gabeta_Res) {
        this.Gabeta_Res = Gabeta_Res;
    }

    public int getCaja_Res() {
        return Caja_Res;
    }

    public void setCaja_Res(int Caja_Res) {
        this.Caja_Res = Caja_Res;
    }

    public String getSeccion_Res() {
        return Seccion_Res;
    }

    public void setSeccion_Res(String Seccion_Res) {
        this.Seccion_Res = Seccion_Res;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getDescripcion_Res() {
        return Descripcion_Res;
    }

    public void setDescripcion_Res(String Descripcion_Res) {
        this.Descripcion_Res = Descripcion_Res;
    }

    public int getCantidad_Res() {
        return Cantidad_Res;
    }

    public void setCantidad_Res(int Cantidad_Res) {
        this.Cantidad_Res = Cantidad_Res;
    }
    
    
}
