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

public final class Meioorc extends Raca {

    @Override
    public void gravar() {
        frase = "Meio-orc ";
        alturaMax = new Float(1.93);
        alturaMin = new Float(1.75);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(102);
        pesoMin = new Float(70);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 60;
        idadeMin = 16;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 2;
        destreza = 2;
        constituicao = 0;
        inteligencia = 0;
        sabedoria = 0;
        carisma = 0;
    }
    /**
     * Construtor da classe.
     */
    public Meioorc() {
        gravar();
    }
}