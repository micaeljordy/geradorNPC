/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
*Classe filha de "Classe"
*
* @author micaeljordy
*/

public final class Mago extends Classe{
    private final Integer dVida = new Integer(6);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "mago criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = 0;
        destreza = 0;
        constituicao = 0;
        inteligencia = ganhoAtributo(nivel);
        sabedoria = 0;
        carisma = 0;

    }
    /**
    * Construtor da classe.
    * 
    * @param nivel
    */
    public Mago(int nivel) {
        gravar(nivel);
        
        //System.out.printf("Ladino: V %d I %d\n", vida, inteligencia);
    }
}
