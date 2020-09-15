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

public final class Anao extends Raca {

    @Override
    public void gravar() {
        frase = "Anão ";
        alturaMax = new Float(1.50);
        alturaMin = new Float(1.25);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(110);
        pesoMin = new Float(80);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 200;
        idadeMin = 20;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 2;
        destreza = 0;
        constituicao = 2;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 0;
    }
    /**
     * Construtor da classe.
     */
    public Anao() {
        gravar();
    }
}