/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
public class Singleton {
    /**
     * Asegura que solo existe una instancia de calculadora
     */
    public Calculadora calculadora(){
            return new Calculadora();
    }
}
