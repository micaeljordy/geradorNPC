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

public final class Bardo extends Classe{
    private final Integer dVida = new Integer(8);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "bardo criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = 0;
        destreza = 0;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = ganhoAtributo(nivel);

    }
    /**
     * Construtor da classe.
     * 
     * @param nivel
     */
    public Bardo(int nivel) {
        gravar(nivel);
        
        //System.out.printf("Bardo: V %d C %d\n", vida, carisma);
    }
}
