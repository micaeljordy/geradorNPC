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

public final class Paladino extends Classe{
    private final Integer dVida = new Integer(10);
    
    @Override
    public void gravar(Integer nivel) {
        frase = "patrulheiro criado!";
        vida = rolagemVida(dVida, nivel);
        //atributos
        forca = 0;
        destreza = 0;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 0;
        
        for(int cont = ganhoAtributo(nivel); cont > 0; cont--) {
        	if(cont%2 == 0)
        	{
        		forca++;
        	}
        	else {
        		carisma++;
        	}
        }
        	
    }
    /**
    * Construtor da classe.
    * 
    * @param nivel
    */
    public Paladino(int nivel) {
        gravar(nivel);
        
        //System.out.printf("Patrulheiro: V %d F %d C %d\n", vida, forca, carisma);
        
    }
}
