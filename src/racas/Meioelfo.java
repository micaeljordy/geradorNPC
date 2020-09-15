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


public final class Meioelfo extends Raca {

    @Override
    public void gravar() {
        frase = "Meio-elfo ";
        alturaMax = new Float(1.85);
        alturaMin = new Float(1.65);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(95);
        pesoMin = new Float(65);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 150;
        idadeMin = 20;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 0;
        destreza = 0;
        constituicao = 2;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 2;
    }
    /**
     * Construtor da classe.
     */
    public Meioelfo() {
        gravar();
    }
}