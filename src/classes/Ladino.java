/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
*Classe filha de "Classe"
*
* @author micaeljordy
*/

public final class Ladino extends Classe{
    private final Integer dVida = new Integer(8);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "ladino criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = 0;
        destreza = ganhoAtributo(nivel);
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 0;

    }
    /**
    * Construtor da classe.
    * 
    * @param nivel
    */
    public Ladino(int nivel) {
        gravar(nivel);
        
        //System.out.printf("Ladino: V %d D %d\n", vida, destreza);
    }
}
