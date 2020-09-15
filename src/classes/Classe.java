/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *Classe abstrata que junta os elementos necessários para criação de alguma classe de RPG.
 * 
 * @author micaeljordy
 */
public abstract class Classe {
    protected String frase; //nome da Classe
    protected Integer vida; //vida da Classe
    //atributos
    protected Integer forca; //bônus da Classe de força
    protected Integer destreza; //bônus da Classe de destreza
    protected Integer constituicao; //bônus da Classe de constituição
    protected Integer inteligencia; //bônus da Classe de inteligência
    protected Integer sabedoria; //bônus da Classe de sabedoria
    protected Integer carisma; //bônus da Classe de carisma
    
    /**
     * Método que as classes filhas reescreverão para adicionar suas particularidades.
     * 
     * @param nivel
     */
    public abstract void gravar(Integer nivel); //método usado para a Classe gravar seus atributos
    
    /**
     * Retorna um vetor de caracteres com o nome da classe.
     * 
     * @return (String) Nome da classe.
     */
    
    public String getFrase(){
        return frase;
    }
    
    /**
     * Retorna a soma obtida da vida.
     * 
     * @return (Integer) vida
     */
    public Integer getVida(){
        return vida;
    }
    /**
     * Retorna a soma obtida da força.
     * 
     * @return (Integer) forca
     */
    public Integer getForca(){
        return forca;
    } 
    /**
     * Retorna a soma obtida da destreza
     * 
     * @return (Integer) destreza
     */
    public Integer getDestreza(){
        return destreza;
    }
    /**
     * Retorna a soma obtida da constituição.
     * 
     * @return (Integer) constituicao
     */
    public Integer getConstituicao(){
        return constituicao;
    } 
    /**
     * Retorna a soma obtida da inteligência.
     * 
     * @return (Integer) inteligencia
     */
    public Integer getInteligencia(){
        return inteligencia;
    }
    /**
     * Retorna a soma obtida da sabedoria.
     * 
     * @return (Integer) sabedoria
     */
    public Integer getSabedoria(){
        return sabedoria;
    } 
    /**
     * Retorna a soma obtida do carisma.
     * 
     * @return (Integer) carisma
     */
    public Integer getCarisma(){
        return carisma;
    }
    
    /**
     * Método que simula a rolagem de vida de uma classe de RPG e soma com o seu valor inicial.
     * @param vida
     * @param nivel
     * @return (Integer) Retorna a vida inicial mais rolagens de dados (uma rolagem por nível).
     */
    protected Integer rolagemVida(Integer vida,Integer nivel) {
        
        Integer resultado = vida;
        Integer cont;
        Integer soma = 0;
        
        for(cont = nivel; cont > 1; cont--) {
        	while(soma < 1) {
        		soma = Math.round((float)(Math.random() * vida));
        	}
        	resultado = resultado + soma;
        	
        	//System.out.println("rolagemVida "+resultado);
        }
        
        return resultado;
    }
    /**
     * Método que simula a adição de pontos no atributo de determinada classe.
     * @param nivel
     * @return (Integer) Soma dos pontos de atributos.
     */
    protected Integer ganhoAtributo(Integer nivel) {
        
        Integer resultado = 0;
        Integer cont;
        
        for(cont = nivel; cont > 0; cont--) {
            if(cont % 4 == 0){
                resultado++;
            }
        }
        
        return resultado;
    }
}
