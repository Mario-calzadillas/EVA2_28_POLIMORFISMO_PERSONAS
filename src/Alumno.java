
import Persona.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Yair Calzadillas Ogaz 18550362
 */
public class Alumno extends Persona{
    private String numControl;

    public String getnumControl() {
        return numControl;
    }

    public void setnumControl(String numControl) {
        this.numControl = numControl;
    }
    
    @Override
    public void ImprimirNombre() {
        
    }
    
}
