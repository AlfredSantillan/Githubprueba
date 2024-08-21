package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CIn implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String Matricula_CI;          //Declaracion de variables y llave primaria
    private String Gabeta_CI;
    private int Caja_CI;
    private String Descripcion_CI;
    private int Cantidad_CI;
    private String Montaje;
    
    public CIn() {

    }

    public CIn(int id, String Matricula_CI, String Gabeta_CI, int Caja_CI, String Descripcion_CI, int Cantidad_CI, String Montaje) {
        this.id = id;
        this.Matricula_CI = Matricula_CI;        //Constructores
        this.Gabeta_CI = Gabeta_CI;
        this.Caja_CI = Caja_CI;
        this.Descripcion_CI = Descripcion_CI;
        this.Cantidad_CI = Cantidad_CI;
        this.Montaje = Montaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;                             //getters y setters
    }

    public String getMatricula_CI() {
        return Matricula_CI;
    }

    public void setMatricula_CI(String Matricula_CI) {
        this.Matricula_CI = Matricula_CI;
    }

    public String getGabeta_CI() {
        return Gabeta_CI;
    }

    public void setGabeta_CI(String Gabeta_CI) {
        this.Gabeta_CI = Gabeta_CI;
    }

    public int getCaja_CI() {
        return Caja_CI;
    }

    public void setCaja_CI(int Caja_CI) {
        this.Caja_CI = Caja_CI;
    }

    public String getDescripcion_CI() {
        return Descripcion_CI;
    }

    public void setDescripcion_CI(String Descripcion_CI) {
        this.Descripcion_CI = Descripcion_CI;
    }

    public int getCantidad_CI() {
        return Cantidad_CI;
    }

    public void setCantidad_CI(int Cantidad_CI) {
        this.Cantidad_CI = Cantidad_CI;
    }

    public String getMontaje() {
        return Montaje;
    }

    public void setMontaje(String Montaje) {
        this.Montaje = Montaje;
    }

  
 
   
}
