package entidades;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import entidades.Categoria;
import entidades.Classificacao;
import entidades.Idioma;
import entidades.Legenda;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "filme")

public class Filme implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "duracao")
    private int duracao;
    @Column(name = "codCategoria")
    private int categoria;
    @Column(name = "codIdioma")
    private int idioma;
    @Column(name = "codClassificacao")
    private int classificacao;
    @Column(name = "codLegenda")
    private int legenda;
    @Column(name = "valor")
    private double valor;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
        return this.getNome();
    }
                
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(int idioma) {
        this.idioma = idioma;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @param legenda the legenda to set
     */
    public void setLegenda(int legenda) {
        this.legenda = legenda;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @return the idioma
     */
    public int getIdioma() {
        return idioma;
    }

    /**
     * @return the classificacao
     */
    public int getClassificacao() {
        return classificacao;
    }

    /**
     * @return the legenda
     */
    public int getLegenda() {
        return legenda;
    }
         
}
