/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racas;

import java.text.DecimalFormat;

/**
 *Classe abstrata que junta os elementos necess�rios para cria��o de alguma ra�a de RPG.
 * 
 * @author micaeljordy
 */
public abstract class Raca {
 
    protected String frase; //nome da ra�a
    protected Float alturaMax; //altura m�xima
    protected Float alturaMin; //altura m�nima
    protected Float altura;
    protected Float pesoMax; //peso m�ximo
    protected Float pesoMin; //peso m�nimo
    protected Float peso;
    protected Integer idadeMax; //idade m�xima
    protected Integer idadeMin; //idade m�nima
    protected Integer idade;
    protected Integer forca; //b�nus racial de for�a
    protected Integer destreza; //b�nus racial de destreza
    protected Integer constituicao; //b�nus racial de constitui��o
    protected Integer inteligencia; //b�nus racial de intelig�ncia
    protected Integer sabedoria; //b�nus racial de sabedoria
    protected Integer carisma; //b�nus racial de carisma
    
    /**
     * M�todo que as classes filhas reescrever�o para adicionar suas particularidades.
     * 
     */
    public abstract void gravar(); //m�todo usado para a ra�a gravar seus atributos
    /**
     * Este m�todo d� a altura ou peso do personagem, utilizando valores m�ximos e 
     * m�nimos como par�metros.
     * @param max
     * @param min
     * @return (Float) Altura ou Peso.
     */
    protected Float fisionomiaAleatoria(Float max, Float min) {
    	Float resultado = new Float(0);
    	
    	while(resultado < min) {
    		resultado = (float)(Math.random() * max);
    		//System.out.println("atributosFisicosAleatorios: repeti��o");
    	}
    	
    	//System.out.println("atributosFisicosAleatorios "+resultado+" "+max+" "+min);
    	
    	return resultado;
    }
    /**
     * Este m�todo d� a idade do personagem utilizando valores m�ximos e m�nimos como 
     * par�metros.
     * @param max
     * @param min
     * @return (Integer) Idade.
     */
    protected Integer idadeAleatoria(Integer max, Integer min) {
    	Float resultado = new Float(0);
    	
    	while(resultado < min) {
    		resultado = (float)(Math.random() * max);
    		//System.out.println("atributosFisicosAleatorios: repeti��o");
    	}
    	
    	//System.out.println("atributosFisicosAleatorios "+resultado+" "+max+" "+min);
    	
    	return Math.round(resultado);
    }
    /**
     * Retorna um vetor de caracteres com a altura no formato decimal ap�s a v�rgula.
     * 
     * @return (String) Altura no formato decimal ap�s a v�rgula. 
     */
    public String getAltura() {
    	DecimalFormat df = new DecimalFormat("#.##");
    	//System.out.println("getAltura "+df.format(altura));
    	return df.format(altura);
    }
    /**
     * Retorna um vetor de caracteres com o peso no formato decimal ap�s a v�rgula.
     * 
     * @return (String) Peso no formato decimal ap�s a v�rgula. 
     */
    public String getPeso() {
    	DecimalFormat df = new DecimalFormat("#.##");
    	//System.out.println("getPeso "+df.format(peso));
    	return df.format(peso);
    }
    /**
     * Retorna a idade do personagem.
     * 
     * @return (Integer) idade
     */
    public Integer getIdade() {
    	return idade;
    }
    /**
     * Retorna um vetor de caracteres com o nome da ra�a.
     * 
     * @return (String) Nome da ra�a.
     */
    public String getFrase(){
        return frase;
    }
    /**
     * Atributo da ra�a.
     * @return (Integer) forca
     */
    public Integer getForca(){
        return forca;
    } 
    /**
     * Atributo da ra�a.
     * @return (Integer) destreza
     */
    public Integer getDestreza(){
        return destreza;
    }
    /**
     * Atributo da ra�a.
     * @return (Integer) constituicao
     */
    public Integer getConstituicao(){
        return constituicao;
    } 
    /**
     * Atributo da ra�a.
     * @return (Integer) inteligencia
     */
    public Integer getInteligencia(){
        return inteligencia;
    }
    /**
     * Atributo da ra�a.
     * @return (Integer) sabedoria
     */
    public Integer getSabedoria(){
        return sabedoria;
    } 
    /**
     * Atributo da ra�a.
     * @return (Integer) carisma
     */
    public Integer getCarisma(){
        return carisma;
    }
}