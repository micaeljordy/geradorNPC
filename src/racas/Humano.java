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

public final class Humano extends Raca {

    @Override
    public void gravar() {
        frase = "Humano ";
        alturaMax = new Float(1.95);
        alturaMin = new Float(1.65);
        altura = fisionomiaAleatoria(alturaMax, alturaMin);
        pesoMax = new Float(110);
        pesoMin = new Float(65);
        peso = fisionomiaAleatoria(pesoMax, pesoMin);
        idadeMax = 65;
        idadeMin = 20;
        idade = idadeAleatoria(idadeMax, idadeMin);
        //atributos
        forca = 1;
        destreza = 1;
        constituicao = 1;
        inteligencia = 1;
        sabedoria = 1;
        carisma = 1;
    }
    /**
     * Construtor da classe.
     */
    public Humano() {
        gravar();
    }
}