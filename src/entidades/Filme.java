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
    private Categoria categoria;
    @Column(name = "codIdioma")
    private Idioma idioma;
    @Column(name = "codClassificacao")
    private Classificacao classificacao;
    @Column(name = "codLegenda")
    private Legenda legenda;
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
        return this.nome;
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
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the idioma
     */
    public Idioma getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the classificacao
     */
    public Classificacao getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the legenda
     */
    public Legenda getLegenda() {
        return legenda;
    }

    /**
     * @param legenda the legenda to set
     */
    public void setLegenda(Legenda legenda) {
        this.legenda = legenda;
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
         
}
