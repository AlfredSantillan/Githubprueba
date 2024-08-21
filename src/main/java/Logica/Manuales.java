package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manuales implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

    int numManual;
    String modelo;
    String numParte;
    String numSerie;
    String Descripcion;
    String marca;

    public Manuales() {
    }

    public Manuales(int id, int numManual, String modelo, String numParte, String numSerie, String Descripcion, String marca) {
        this.id = id;
        this.numManual = numManual;
        this.modelo = modelo;
        this.numParte = numParte;
        this.numSerie = numSerie;
        this.Descripcion = Descripcion;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumManual() {
        return numManual;
    }

    public void setNumManual(int numManual) {
        this.numManual = numManual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumParte() {
        return numParte;
    }

    public void setNumParte(String numParte) {
        this.numParte = numParte;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
