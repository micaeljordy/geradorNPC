/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador_de_npcs;

import java.util.Scanner;

/*Esta aplica��o tem como objetivo gerar uma ficha aleat�ria de um personagem do tipo "NPC"
 * de "D&D" ou outro RPG de mesa com sistema parecido. 
 */

/**
 * Classe que cont�m o m�todo principal da aplica��o "Gerador_de_NPCs".
 * 
 * @author micaeljordy
 */
public class Gerador_de_NPCs {
/**
 * M�todo que cria um evento para escolher um n�mero de zero at� um valor m�ximo.
 * 
 * @param (Integer) Quantidade de elementos que ir�o ser participar do evento.
 * @return (Integer) Elemento que foi aleatoriamente sorteado.
 */
	static Integer elementoAleatorio(Integer valor_maximo) {
		Integer resultado = new Integer(Math.round((float) Math.random() * valor_maximo));

		return resultado;
	}

	/**
	 * M�todo principal de "Gerador_de_NPCs". O usu�rio ir� interagir com a
	 * aplica��o atrav�s de um prompt de comando ou terminal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner dado = new Scanner(System.in);
		Character chave = new Character('s'); //Char utilizado unicamente para interagir com o usu�rio
		Character chave_2; //Char utilizado unicamente para interagir com o usu�rio
		MenuInicial m = new MenuInicial();

		do {
			m.menu();
			String nome = dado.nextLine();
			m.menu_2();
			Integer nivel = dado.nextInt();
			m.menu_6();
			chave_2 = new Character('s');

			while ((chave_2 == 's') || (chave_2 == 'S')) {
				Integer raca = elementoAleatorio(6);
				Integer classe = elementoAleatorio(11);

				Npc novo = new Npc(nome, raca, classe, nivel);
				String ficha = new String(novo.ficha());

				System.out.printf(ficha);
				m.menu_3();
				chave_2 = dado.next().charAt(0);
				m.menu_6();
			}
			m.menu_4();
			chave = dado.next().charAt(0);
			dado.nextLine();
			m.menu_6();
		} while ((chave == 's') || (chave == 'S'));

		m.menu_5();
	}
}
