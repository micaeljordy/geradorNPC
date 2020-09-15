/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *Classe abstrata que junta os elementos necess�rios para cria��o de alguma classe de RPG.
 * 
 * @author micaeljordy
 */
public abstract class Classe {
    protected String frase; //nome da Classe
    protected Integer vida; //vida da Classe
    //atributos
    protected Integer forca; //b�nus da Classe de for�a
    protected Integer destreza; //b�nus da Classe de destreza
    protected Integer constituicao; //b�nus da Classe de constitui��o
    protected Integer inteligencia; //b�nus da Classe de intelig�ncia
    protected Integer sabedoria; //b�nus da Classe de sabedoria
    protected Integer carisma; //b�nus da Classe de carisma
    
    /**
     * M�todo que as classes filhas reescrever�o para adicionar suas particularidades.
     * 
     * @param nivel
     */
    public abstract void gravar(Integer nivel); //m�todo usado para a Classe gravar seus atributos
    
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
     * Retorna a soma obtida da for�a.
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
     * Retorna a soma obtida da constitui��o.
     * 
     * @return (Integer) constituicao
     */
    public Integer getConstituicao(){
        return constituicao;
    } 
    /**
     * Retorna a soma obtida da intelig�ncia.
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
     * M�todo que simula a rolagem de vida de uma classe de RPG e soma com o seu valor inicial.
     * @param vida
     * @param nivel
     * @return (Integer) Retorna a vida inicial mais rolagens de dados (uma rolagem por n�vel).
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
     * M�todo que simula a adi��o de pontos no atributo de determinada classe.
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
