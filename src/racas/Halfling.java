/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racas;

/**
*Classe filha de "Raca"
*
* @author micaeljordy
*/

public final class Halfling extends Raca {

    @Override
    public void gravar() {
        frase = "Halfling ";
        alturaMax = new Float(1.25);
        alturaMin = new Float(1.15);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(50);
        pesoMin = new Float(35);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 120;
        idadeMin = 20;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 0;
        destreza = 2;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 2;
    }
    /**
     * Construtor da classe.
     */
    public Halfling() {
        gravar();
    }
}