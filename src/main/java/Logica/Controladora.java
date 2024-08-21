package Logica;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Controladora Logica de tabla de circuitos integrados
    public void guardar(String gabeta_CI, int caja_CI, String matricula_CI, String descripcion_CI, int cantidad_CI, String montaje_CI) {

        CIn circuit = new CIn();
        circuit.setGabeta_CI(gabeta_CI);
        circuit.setCaja_CI(caja_CI);
        circuit.setMatricula_CI(matricula_CI);
        circuit.setDescripcion_CI(descripcion_CI);
        circuit.setCantidad_CI(cantidad_CI);
        circuit.setMontaje(montaje_CI);

        controlPersis.guardar(circuit);

    }

    public List<CIn> traerCI() {
        return controlPersis.traerCI();
    }

    public void borrarCI(int id) {
        controlPersis.borrarCI(id);
    }

    public CIn traerCI(int id) {
        return controlPersis.traerCI(id);
    }

    public void modificarCI(CIn circuit, String gabeta_CI, int caja_CI, String matricula_CI, String descripcion_CI, int cantidad_CI, String montaje_CI) {

        circuit.setGabeta_CI(gabeta_CI);
        circuit.setCaja_CI(caja_CI);
        circuit.setMatricula_CI(matricula_CI);
        circuit.setDescripcion_CI(descripcion_CI);
        circuit.setCantidad_CI(cantidad_CI);
        circuit.setMontaje(montaje_CI);

        //Modificar Circuito Integrado
        controlPersis.modificarCI(circuit);

    }

    public List<CIn> buscarCI() {
        return controlPersis.buscarCI();
    }

    //Controladora Logica de la tabla de Resistencias
    public void guardarRes(int caja_Res, int cantidad_Res, String descripcion_Res, String gabeta_Res, String matricula_Res, String seccion_Res) {

        Resistencias res = new Resistencias();
        res.setCaja_Res(caja_Res);
        res.setCantidad_Res(cantidad_Res);
        res.setDescripcion_Res(descripcion_Res);
        res.setGabeta_Res(gabeta_Res);
        res.setMatricula(matricula_Res);
        res.setSeccion_Res(seccion_Res);

        controlPersis.guardarRes(res);

    }

    public List<Resistencias> traerRes() {
        return controlPersis.traerRes();
    }

    public void borrarRes(int id) {
        controlPersis.borrarRes(id);
    }

    public Resistencias traerRes(int id) {
        return controlPersis.traerRes(id);
    }

    public void modificarRes(Resistencias resi, int caja_Res, int cantidad_Res, String descripcion_Res, String gabeta_Res, String matricula_Res, String seccion_Res) {

        resi.setCaja_Res(caja_Res);
        resi.setCantidad_Res(cantidad_Res);
        resi.setDescripcion_Res(descripcion_Res);
        resi.setGabeta_Res(gabeta_Res);
        resi.setMatricula(matricula_Res);
        resi.setSeccion_Res(seccion_Res);

        controlPersis.modificarRes(resi);
    }

    //Controladora Logica de la tabla de Capacitores
    public void GuardarCap(int caja_Cap, int cantidad_Cap, String caracteristica_Cap, String gabeta_Cap, String matricula_Cap, String voltaje_Cap) {

        Capacitores cap = new Capacitores();
        cap.setCaja_Cap(caja_Cap);
        cap.setCantidad_Cap(cantidad_Cap);
        cap.setCaracteristica_Cap(caracteristica_Cap);
        cap.setGabeta_Cap(gabeta_Cap);
        cap.setMatricula_Cap(matricula_Cap);
        cap.setVoltaje_Cap(voltaje_Cap);

        controlPersis.GuardarCap(cap);

    }

    public List<Capacitores> traerCap() {
        return controlPersis.traerCap();
    }

    public void borrarCap(int id) {
        controlPersis.borrarCap(id);

    }

    public Capacitores traerCap(int id) {
        return controlPersis.traerCap(id);
    }

    public void modificarCap(Capacitores cap, String gabeta_Cap, int caja_Cap, int cantidad_Cap, String caracteristicas_Cap, String matricula_Cap,
            String voltaje_Cap) {
        cap.setCaja_Cap(caja_Cap);
        cap.setCantidad_Cap(cantidad_Cap);
        cap.setCaracteristica_Cap(caracteristicas_Cap);
        cap.setGabeta_Cap(gabeta_Cap);
        cap.setMatricula_Cap(matricula_Cap);
        cap.setVoltaje_Cap(voltaje_Cap);

        controlPersis.modificarCap(cap);
    }

    //Controladora logica de la tabla de Diodos
    public void guardardio(int caja_Dio, int cantidad_Dio, String caracteristicas_Dio, String gabeta_Dio, String matricula_Dio) {

        Diodos dio = new Diodos();
        dio.setCaja_dio(caja_Dio);
        dio.setCantidad_dio(cantidad_Dio);
        dio.setCaracteristicas_dio(caracteristicas_Dio);
        dio.setGabeta_dio(gabeta_Dio);
        dio.setMatricula_dio(matricula_Dio);

        controlPersis.guardardio(dio);

    }

    public List<Diodos> traerDio() {
        return controlPersis.traerDio();
    }

    public void borrarDio(int id) {
        controlPersis.borrarDio(id);
    }

    public Diodos traerDio(int id) {
        return controlPersis.traerDio(id);
    }

    public void modificarDio(Diodos dio, int caja_Dio, int cantidad_Dio, String caracteristicas_Dio, String gabeta_Dio, String matricula_Dio) {

        dio.setCaja_dio(caja_Dio);
        dio.setCantidad_dio(cantidad_Dio);
        dio.setCaracteristicas_dio(caracteristicas_Dio);
        dio.setGabeta_dio(gabeta_Dio);
        dio.setMatricula_dio(matricula_Dio);

        controlPersis.modificarDio(dio);

    }

    //Controladora logica de la tabla de Varios
    public void guardarvar(int caja_Var, int cantidad_Var, String descripcion_Var, String gabeta_Var, String matricula_Var) {
        Varios var = new Varios();
        var.setCaja_var(caja_Var);
        var.setCantidad_var(cantidad_Var);
        var.setDescripcion_var(descripcion_Var);
        var.setGabeta_var(gabeta_Var);
        var.setMatricula_var(matricula_Var);

        controlPersis.guardarvar(var);
    }

    public List<Varios> traervar() {
        return controlPersis.TraerVar();
    }

    public void borrarVar(int id) {
        controlPersis.borrarVar(id);

    }

    public Varios traervar(int id) {

        return controlPersis.TraerVar(id);

    }

    public void modificarVar(Varios var, int caja_Var, int cantidad_Var, String descripcion_Var, String gabeta_Var, String matricula_Var) {
        var.setCaja_var(caja_Var);
        var.setCantidad_var(cantidad_Var);
        var.setDescripcion_var(descripcion_Var);
        var.setGabeta_var(gabeta_Var);
        var.setMatricula_var(matricula_Var);

        controlPersis.modificarVar(var);

    }

    //Controladora logica de la tabla de Transistores
    public void guardarTra(int caja_Tra, int cantidad_Tra, String caracteristicas_Tra, String gabeta_Tra, String matricula_Tra) {
        Transistores trans = new Transistores();
        trans.setCaja_tra(caja_Tra);
        trans.setCantidad_tra(cantidad_Tra);
        trans.setCaracteristicas_tra(caracteristicas_Tra);
        trans.setGabtea_tra(gabeta_Tra);
        trans.setMatricula_tra(matricula_Tra);

        controlPersis.guardarTra(trans);
    }

    public List<Transistores> traerTrans() {
        return controlPersis.traerTrans();
    }

    public void borrarTrans(int id) {

        controlPersis.borrarTrans(id);
    }

    public Transistores traerTrans(int id) {
        return controlPersis.traerTrans(id);
    }

    public void modificarTra(Transistores tra, int caja_Tra, int cantidad_tra, String caracteristicas_Tra, String gabeta_Tra, String matricula_Tra) {

        tra.setCaja_tra(caja_Tra);
        tra.setCantidad_tra(cantidad_tra);
        tra.setCaracteristicas_tra(caracteristicas_Tra);
        tra.setGabtea_tra(gabeta_Tra);
        tra.setMatricula_tra(matricula_Tra);

        controlPersis.modificarTra(tra);

    }

    //Controladora logica de la tabla de Pasivos
    public void guardarpas(int caja_Pas, int cantidad_Pas, String descripcion_Pas, String gabeta_Pas, String matricula_Pas) {

        Pasivos pasi = new Pasivos();
        pasi.setCaja_pas(caja_Pas);
        pasi.setCantidad_pas(cantidad_Pas);
        pasi.setDescripcion_pas(descripcion_Pas);
        pasi.setGabeta_pas(gabeta_Pas);
        pasi.setMatricula_pas(matricula_Pas);

        controlPersis.guardarPas(pasi);

    }

    public List<Pasivos> traerPasivos() {
        return controlPersis.traerPas();

    }

    public void borrarPas(int id) {
        controlPersis.borrarPas(id);
    }

    public Pasivos traerPasivos(int id) {
        return controlPersis.traerPas(id);

    }

    public void modificarPas(Pasivos pas, int caja_Pas, int cantidad_Pas, String descripcion_Pas, String gabeta_Pas, String matricula_Pas) {

        pas.setCaja_pas(caja_Pas);
        pas.setCantidad_pas(cantidad_Pas);
        pas.setDescripcion_pas(descripcion_Pas);
        pas.setGabeta_pas(gabeta_Pas);
        pas.setMatricula_pas(matricula_Pas);

        controlPersis.modificarPas(pas);

    }

    // Controladora logica de la tabla de Manuales
    public void guardarManual(String model, String descripcion, String numserie, int nummanual, String numparte, String marc) {

        Manuales man = new Manuales();
        man.setModelo(model);
        man.setDescripcion(descripcion);
        man.setNumSerie(numserie);
        man.setNumManual(nummanual);
        man.setNumParte(numparte);
        man.setMarca(marc);

        controlPersis.guardarManuales(man);
    }

    public List<Manuales> traerManu() {
        return controlPersis.traerManuales();
    }

    public void borrarMan(int id) {

        controlPersis.borrarMan(id);
    }
    
        public void modificarMan(Manuales man, int num_manual, String modelo, String num_parte, String num_serie, String descripcion, String marca) {
    
            man.setNumManual(num_manual);
            man.setModelo(modelo);
            man.setNumParte(num_parte);
            man.setNumSerie(num_serie);
            man.setDescripcion(descripcion);
            man.setMarca(marca);
            
            controlPersis.modificarMan(man);
            
        }
        
            public Manuales traerManu(int id) {
                return controlPersis.traerManuales(id);
    }

    //Controladora Logica de Tabla Arneses
    public void guardarManual(String descripcion, int numbol) {
        Arnes ar = new Arnes();
        ar.setDescripcion(descripcion);
        ar.setNumBol(numbol);

        controlPersis.guardarArn(ar);
    }

    public List<Arnes> traerArnes() {
        return controlPersis.traeArnes();
    }

    public void borrarAr(int id) {

        controlPersis.borrarAr(id);

    }

    public void modificarAr(Arnes ar, int num_bolsa, String descripcion) {
        
        ar.setDescripcion(descripcion);
        ar.setNumBol(num_bolsa);
        
        controlPersis.modificarAr(ar);
        
    }

    public Arnes traerArnes(int id) {
        return controlPersis.traeArnes(id);
        }

}
