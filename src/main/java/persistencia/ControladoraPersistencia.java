package persistencia;

import InventariosMyA.Arneses;
import Logica.Arnes;
import Logica.CIn;
import Logica.Capacitores;
import Logica.Diodos;
import Logica.Manuales;
import Logica.Pasivos;
import Logica.Resistencias;
import Logica.Transistores;
import Logica.Varios;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    //Control de persistencia de la tabla de Circuitos Integrados
    CInJpaController circu = new CInJpaController();
    ResistenciasJpaController resis = new ResistenciasJpaController();
    CapacitoresJpaController capa = new CapacitoresJpaController();
    DiodosJpaController diodo = new DiodosJpaController();
    VariosJpaController varios = new VariosJpaController();
    TransistoresJpaController transis = new TransistoresJpaController();
    PasivosJpaController pasiv = new PasivosJpaController();
    ManualesJpaController manual = new ManualesJpaController();
    ArnesJpaController arn = new ArnesJpaController();

    public void guardar(CIn circuit) {

        circu.create(circuit);

    }

    public List<CIn> traerCI() {
        return circu.findCInEntities();
    }

    public void borrarCI(int id) {
        try {
            circu.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CIn traerCI(int id) {
        return circu.findCIn(id);

    }

    public void modificarCI(CIn circuit) {
        try {
            circu.edit(circuit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CIn> buscarCI() {
        return circu.findCInEntities();
    }

    //Control de persistencia de la tabla de Resistencia
    public void guardarRes(Resistencias res) {

        resis.create(res);
    }

    public List<Resistencias> traerRes() {
        return resis.findResistenciasEntities();
    }

    public void borrarRes(int id) {
        try {
            resis.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Resistencias traerRes(int id) {
        return resis.findResistencias(id);
    }

    public void modificarRes(Resistencias resi) {
        try {
            resis.edit(resi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Control de persistencia de la tabla de Capacitores
    public void GuardarCap(Capacitores cap) {
        capa.create(cap);
    }

    public List<Capacitores> traerCap() {
        return capa.findCapacitoresEntities();
    }

    public void borrarCap(int id) {
        try {
            capa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Capacitores traerCap(int id) {

        return capa.findCapacitores(id);

    }

    public void modificarCap(Capacitores cap) {

        try {
            capa.edit(cap);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Control de persistencia de la tabla de Diodos
    public void guardardio(Diodos dio) {

        diodo.create(dio);

    }

    public List<Diodos> traerDio() {
        return diodo.findDiodosEntities();
    }

    public void borrarDio(int id) {
        try {
            diodo.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Diodos traerDio(int id) {
        return diodo.findDiodos(id);
    }

    public void modificarDio(Diodos dio) {

        try {
            diodo.edit(dio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Control de persistencia de la tabla de Varios
    public void guardarvar(Varios var) {

        varios.create(var);
    }

    public List<Varios> TraerVar() {
        return varios.findVariosEntities();
    }

    public void borrarVar(int id) {
        try {
            varios.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Varios TraerVar(int id) {

        return varios.findVarios(id);
    }

    public void modificarVar(Varios var) {

        try {
            varios.edit(var);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Control de persistencia de la tabla de Transistores
    public void guardarTra(Transistores trans) {

        transis.create(trans);
    }

    public List<Transistores> traerTrans() {
        return transis.findTransistoresEntities();
    }

    public void borrarTrans(int id) {
        try {
            transis.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Transistores traerTrans(int id) {
        return transis.findTransistores(id);
    }

    public void modificarTra(Transistores tra) {
        try {
            transis.edit(tra);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Control de persistencia de la tabla de Pasivos
    public void guardarPas(Pasivos pasi) {

        pasiv.create(pasi);

    }

    public List<Pasivos> traerPas() {
        return pasiv.findPasivosEntities();
    }

    public void borrarPas(int id) {
        try {
            pasiv.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pasivos traerPas(int id) {
        return pasiv.findPasivos(id);
    }

    public void modificarPas(Pasivos pas) {
        try {
            pasiv.edit(pas);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Control de persistencia de la tabla de Manuales
    public void guardarManuales(Manuales man) {
        manual.create(man);
    }

    public List<Manuales> traerManuales() {
        return manual.findManualesEntities();
    }

    public void borrarMan(int id) {
        try {
            manual.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarMan(Manuales man) {
        try {
            manual.edit(man);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public Manuales traerManuales(int id) {
            return manual.findManuales(id);
    }

    //Control de persistencia de la tabla Arneses
    public void guardarArn(Arnes ar) {
        arn.create(ar);
    }

    public List<Arnes> traeArnes() {

        return arn.findArnesEntities();
    }

    public void borrarAr(int id) {

        try {
            arn.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Arnes traeArnes(int id) {

       return arn.findArnes(id);
        
    }

    public void modificarAr(Arnes ar) {

        try {
            arn.edit(ar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
