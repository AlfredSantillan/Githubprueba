
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diodos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String Gabeta_dio;
    private int Caja_dio;
    private String Matricula_dio;
    private String Caracteristicas_dio;
    private int Cantidad_dio;   

    public Diodos() {
    }

    public Diodos(int id, String Gabeta_dio, int Caja_dio, String Matricula_dio, String Caracteristicas_dio, int Cantidad_dio) {
        this.id = id;
        this.Gabeta_dio = Gabeta_dio;
        this.Caja_dio = Caja_dio;
        this.Matricula_dio = Matricula_dio;
        this.Caracteristicas_dio = Caracteristicas_dio;
        this.Cantidad_dio = Cantidad_dio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGabeta_dio() {
        return Gabeta_dio;
    }

    public void setGabeta_dio(String Gabeta_dio) {
        this.Gabeta_dio = Gabeta_dio;
    }

    public int getCaja_dio() {
        return Caja_dio;
    }

    public void setCaja_dio(int Caja_dio) {
        this.Caja_dio = Caja_dio;
    }

    public String getMatricula_dio() {
        return Matricula_dio;
    }

    public void setMatricula_dio(String Matricula_dio) {
        this.Matricula_dio = Matricula_dio;
    }

    public String getCaracteristicas_dio() {
        return Caracteristicas_dio;
    }

    public void setCaracteristicas_dio(String Caracteristicas_dio) {
        this.Caracteristicas_dio = Caracteristicas_dio;
    }

    public int getCantidad_dio() {
        return Cantidad_dio;
    }

    public void setCantidad_dio(int Cantidad_dio) {
        this.Cantidad_dio = Cantidad_dio;
    }
    
}
