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

public final class Elfo extends Raca {

    @Override
    public void gravar() {
        frase = "Elfo ";
        alturaMax = new Float(1.80);
        alturaMin = new Float(1.50);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(85);
        pesoMin = new Float(65);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 1000;
        idadeMin = 110;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 0;
        destreza = 2;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 2;
        carisma = 0;
    }
    /**
     * Construtor da classe.
     */
    public Elfo() {
        gravar();
    }
}