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

public final class Guerreiro extends Classe{
    private final Integer dVida = new Integer(10);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "guerreiro criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = ganhoAtributo(nivel);
        destreza = forca;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 0;
        
        if(nivel % 2 == 0) {
        	destreza = 0;
        }
        else {
            forca = 0;
        }
    }
    /**
    * Construtor da classe.
    * 
    * @param nivel
    */
    public Guerreiro(int nivel) {
        gravar(nivel);
       
        //System.out.printf("Guerreiro: V %d F %d D %d\n", vida, forca, destreza);  
    }
}
