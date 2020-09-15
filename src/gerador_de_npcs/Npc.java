/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador_de_npcs;

import racas.Anao;
import racas.Elfo;
import racas.Halfling;
import racas.Humano;
import racas.Meioelfo;
import racas.Meioorc;
import classes.Guerreiro;
import classes.Ladino;
import classes.Patrulheiro;
import classes.Mago;
import classes.Monge;
import classes.Paladino;
import classes.Barbaro;
import classes.Bardo;
import classes.Bruxo;
import classes.Clerigo;
import classes.Druida;
import classes.Feiticeiro;
import java.util.Calendar;

/**
 *Classe que constrói o objeto qual representa o "NPC" (non-player character).
 * 
 * @author micaeljordy
 */
public class Npc {
	//características que serão construidas ao longo da classe
	private StringBuilder construtor_da_ficha; //string qual será construída ao longo desta classe
	private String nome; //nome digitado pelo usuário
	private String altura = new String(); //altura no formato decimal
	private String peso = new String(); //peso no formato decimal
	private Integer idade = 0; 
	private Integer nivel = 0;
	private Integer vida = 0;
	//atributos contruidos ao longo da classe
	private Integer iniciativa = 0;
	private Integer forca = 0; 
	private Integer destreza = 0; 
	private Integer constituicao = 0; 
	private Integer inteligencia = 0; 
	private Integer sabedoria = 0; 
	private Integer carisma = 0; 

	/**
	 * Método que simula um evento com quatro dados de seis lados.
	 * 
	 * @return (Integer) Um inteiro que representa a soma dos dados 
	 * menos o menor valor obtido.
	 */
	private Integer atributoAleatorio() {
		Double num1 = new Double(0); // dado 1
		Double num2 = new Double(0); // dado 2
		Double num3 = new Double(0); // dado 3
		Double num4 = new Double(0); // dado 4
		Double menor = new Double(0); // menor valor obtido

		while (num1 < 1) {
			num1 = Math.random() * 6;
			menor = num1;
		}
		while (num2 < 1) {
			num2 = Math.random() * 6;

			if (num2 >= 1) {
				menor = Math.min(menor, num2);
			}
		}
		while (num3 < 1) {
			num3 = Math.random() * 6;

			if (num3 >= 1) {
				menor = Math.min(menor, num3);
			}
		}
		while (num4 < 1) {
			num4 = Math.random() * 6;

			if (num4 >= 1) {
				menor = Math.min(menor, num4);
			}
		}

		Float resultado = (float) (num1 + num2 + num3 + num4 - menor);

		/*
		 * System.out.printf("atributoAleatorio %f 1 %f 2 %f 3 %f 4 %f sub\n",num1,
		 * num2, num3, num4, menor); System.out.printf("atributoAleatorio %f\n", num1 +
		 * num2 + num3 + num4 - menor);
		 */

		return Math.round(resultado);
	}
	/**
	 * Método que verifica se um atributo exceda seus limites máximo e mínimo.
	 * @param atributo
	 * @return (Integer) Retorna o atributo após a checagem.
	 */
	private Integer controleAtributo(Integer atributo) {
		if (atributo < 4) {
			return 4;
		}

		if (atributo > 30) {
			return 30;
		}

		return atributo;
	}
	
	/**
	 * Método que retorna o modificador calculado através de um atributo.
	 * @param atributo
	 * @return (Integer) O valor correspondente ao modificador.
	 */

	private Integer modificadorDe(Integer atributo) {
		if ((atributo > 3) && (atributo <= 5)) {
			return -3;
		}
		if ((atributo > 5) && (atributo <= 7)) {
			return -2;
		}
		if ((atributo > 7) && (atributo <= 9)) {
			return -1;
		}
		if ((atributo > 9) && (atributo <= 11)) {
			return 0;
		}
		if ((atributo > 11) && (atributo <= 13)) {
			return 1;
		}
		if ((atributo > 13) && (atributo <= 15)) {
			return 2;
		}
		if ((atributo > 15) && (atributo <= 17)) {
			return 3;
		}
		if ((atributo > 17) && (atributo <= 19)) {
			return 4;
		}
		if ((atributo > 19) && (atributo <= 21)) {
			return 5;
		}
		if ((atributo > 21) && (atributo <= 23)) {
			return 6;
		}
		if ((atributo > 23) && (atributo <= 25)) {
			return 7;
		}
		if ((atributo > 25) && (atributo <= 27)) {
			return 8;
		}
		if ((atributo > 27) && (atributo <= 29)) {
			return 9;
		} else {
			return 10;
		}
	}
	/**
	 * Construtor da classe Npc.
	 * @param nome
	 * @param raca
	 * @param classe
	 * @param nivel
	 */
	public Npc(String nome, int raca, int classe, int nivel) {

		while (vida < 6) {
			construtor_da_ficha = new StringBuilder();
			this.nome = nome;
			forca = atributoAleatorio();
			destreza = atributoAleatorio();
			constituicao = atributoAleatorio();
			inteligencia = atributoAleatorio();
			sabedoria = atributoAleatorio();
			carisma = atributoAleatorio();

			if (raca == 0) {
				Elfo r = new Elfo();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 1) {
				Humano r = new Humano();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 2) {
				Anao r = new Anao();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 3) {
				Halfling r = new Halfling();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 4) {
				Meioelfo r = new Meioelfo();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 5) {
				Meioorc r = new Meioorc();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			} else if (raca == 6) {
				Meioorc r = new Meioorc();
				construtor_da_ficha.append(r.getFrase());
				altura = r.getAltura();
				peso = r.getPeso();
				idade = r.getIdade();
				forca = forca + r.getForca();
				destreza = destreza + r.getDestreza();
				constituicao = constituicao + r.getConstituicao();
				inteligencia = inteligencia + r.getInteligencia();
				sabedoria = sabedoria + r.getSabedoria();
				carisma = carisma + r.getCarisma();

			}

			if (classe == 0) {
				Guerreiro c = new Guerreiro(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 1) {
				Ladino c = new Ladino(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 2) {
				Patrulheiro c = new Patrulheiro(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 3) {
				Mago c = new Mago(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 4) {
				Barbaro c = new Barbaro(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 5) {
				Bardo c = new Bardo(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 6) {
				Bruxo c = new Bruxo(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 7) {
				Druida c = new Druida(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 8) {
				Feiticeiro c = new Feiticeiro(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 9) {
				Clerigo c = new Clerigo(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 10) {
				Monge c = new Monge(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			} else if (classe == 11) {
				Paladino c = new Paladino(nivel);
				construtor_da_ficha.append(c.getFrase());
				vida = vida + c.getVida();

				forca = forca + c.getForca();
				destreza = destreza + c.getDestreza();
				constituicao = constituicao + c.getConstituicao();
				inteligencia = inteligencia + c.getInteligencia();
				sabedoria = sabedoria + c.getSabedoria();
				carisma = carisma + c.getCarisma();

			}

			vida = vida + (modificadorDe(constituicao) * nivel);
			iniciativa = modificadorDe(destreza);
			this.nivel = nivel;

			forca = controleAtributo(forca);
			destreza = controleAtributo(destreza);
			constituicao = controleAtributo(constituicao);
			inteligencia = controleAtributo(inteligencia);
			sabedoria = controleAtributo(sabedoria);
			carisma = controleAtributo(carisma);
		}
	}

	/**
	 * Método que retorna um vetor de caracteres com as informações obtidas ao longo da classe.
	 * 
	 * @return (String) Um vetor de caracteres com todas informações do NPC gerado.
	 */
	public String ficha() {
		String nl = new String("\n");
		String mdf = new String("Modificador: ");
		String b = new String("/");
		String e = new String(" ");
		Calendar data = Calendar.getInstance();

		construtor_da_ficha.append(nl + nl);
		construtor_da_ficha.append("Nome:         " + nome + nl);
		//características
		construtor_da_ficha.append(nl + "CARACTERÍSTICAS" + nl);
		construtor_da_ficha.append("Vida:         " + vida + nl);
		construtor_da_ficha.append("Altura:       " + altura + "m" + nl);
		construtor_da_ficha.append("Peso:         " + peso + "Kg" + nl);
		construtor_da_ficha.append("Idade:        " + idade + " anos" + nl);
		construtor_da_ficha.append("Nível:        " + nivel + nl);
		//atributos
		construtor_da_ficha.append(nl + "ATRIBUTOS" + nl);
		construtor_da_ficha.append("Iniciativa:   " + iniciativa + nl);
		construtor_da_ficha.append("Força:        " + forca + e + e + e + e + mdf + modificadorDe(forca) + nl);
		construtor_da_ficha.append("Destreza:     " + destreza + e + e + e + e + mdf + modificadorDe(destreza) + nl);
		construtor_da_ficha
				.append("Constituição: " + constituicao + e + e + e + e + mdf + modificadorDe(constituicao) + nl);
		construtor_da_ficha
				.append("Inteligência: " + inteligencia + e + e + e + e + mdf + modificadorDe(inteligencia) + nl);
		construtor_da_ficha.append("Sabedoria:    " + sabedoria + e + e + e + e + mdf + modificadorDe(sabedoria) + nl);
		construtor_da_ficha.append("Carisma:      " + carisma + e + e + e + e + mdf + modificadorDe(carisma) + nl);
		construtor_da_ficha.append(nl);
		//data
		construtor_da_ficha.append("Gerado em:    " + data.get(Calendar.DAY_OF_MONTH) + b
				+ (data.get(Calendar.MONTH) + 1) + b + data.get(Calendar.YEAR));
		construtor_da_ficha.append(nl + nl);

		return construtor_da_ficha.toString();
	}
}
