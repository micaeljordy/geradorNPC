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
public final class Barbaro extends Classe{
    private final Integer dVida = new Integer(12);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "bárbaro criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = ganhoAtributo(nivel);
        destreza = 0;
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
    public Barbaro(int nivel) {
        gravar(nivel);
        
        //System.out.printf("Barbaro: V %d F %d\n", vida, forca);
    }
}
