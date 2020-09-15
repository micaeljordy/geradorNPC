/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racas;

import java.text.DecimalFormat;

/**
 *Classe abstrata que junta os elementos necessários para criação de alguma raça de RPG.
 * 
 * @author micaeljordy
 */
public abstract class Raca {
 
    protected String frase; //nome da raça
    protected Float alturaMax; //altura máxima
    protected Float alturaMin; //altura mínima
    protected Float altura;
    protected Float pesoMax; //peso máximo
    protected Float pesoMin; //peso mínimo
    protected Float peso;
    protected Integer idadeMax; //idade máxima
    protected Integer idadeMin; //idade mínima
    protected Integer idade;
    protected Integer forca; //bônus racial de força
    protected Integer destreza; //bônus racial de destreza
    protected Integer constituicao; //bônus racial de constituição
    protected Integer inteligencia; //bônus racial de inteligência
    protected Integer sabedoria; //bônus racial de sabedoria
    protected Integer carisma; //bônus racial de carisma
    
    /**
     * Método que as classes filhas reescreverão para adicionar suas particularidades.
     * 
     */
    public abstract void gravar(); //método usado para a raça gravar seus atributos
    /**
     * Este método dá a altura ou peso do personagem, utilizando valores máximos e 
     * mínimos como parâmetros.
     * @param max
     * @param min
     * @return (Float) Altura ou Peso.
     */
    protected Float fisionomiaAleatoria(Float max, Float min) {
    	Float resultado = new Float(0);
    	
    	while(resultado < min) {
    		resultado = (float)(Math.random() * max);
    		//System.out.println("atributosFisicosAleatorios: repetição");
    	}
    	
    	//System.out.println("atributosFisicosAleatorios "+resultado+" "+max+" "+min);
    	
    	return resultado;
    }
    /**
     * Este método dá a idade do personagem utilizando valores máximos e mínimos como 
     * parâmetros.
     * @param max
     * @param min
     * @return (Integer) Idade.
     */
    protected Integer idadeAleatoria(Integer max, Integer min) {
    	Float resultado = new Float(0);
    	
    	while(resultado < min) {
    		resultado = (float)(Math.random() * max);
    		//System.out.println("atributosFisicosAleatorios: repetição");
    	}
    	
    	//System.out.println("atributosFisicosAleatorios "+resultado+" "+max+" "+min);
    	
    	return Math.round(resultado);
    }
    /**
     * Retorna um vetor de caracteres com a altura no formato decimal após a vírgula.
     * 
     * @return (String) Altura no formato decimal após a vírgula. 
     */
    public String getAltura() {
    	DecimalFormat df = new DecimalFormat("#.##");
    	//System.out.println("getAltura "+df.format(altura));
    	return df.format(altura);
    }
    /**
     * Retorna um vetor de caracteres com o peso no formato decimal após a vírgula.
     * 
     * @return (String) Peso no formato decimal após a vírgula. 
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
     * Retorna um vetor de caracteres com o nome da raça.
     * 
     * @return (String) Nome da raça.
     */
    public String getFrase(){
        return frase;
    }
    /**
     * Atributo da raça.
     * @return (Integer) forca
     */
    public Integer getForca(){
        return forca;
    } 
    /**
     * Atributo da raça.
     * @return (Integer) destreza
     */
    public Integer getDestreza(){
        return destreza;
    }
    /**
     * Atributo da raça.
     * @return (Integer) constituicao
     */
    public Integer getConstituicao(){
        return constituicao;
    } 
    /**
     * Atributo da raça.
     * @return (Integer) inteligencia
     */
    public Integer getInteligencia(){
        return inteligencia;
    }
    /**
     * Atributo da raça.
     * @return (Integer) sabedoria
     */
    public Integer getSabedoria(){
        return sabedoria;
    } 
    /**
     * Atributo da raça.
     * @return (Integer) carisma
     */
    public Integer getCarisma(){
        return carisma;
    }
}