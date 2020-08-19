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

/**
 *
 * @author Acer
 */
public class Filme implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "duracao")
    private Time duracao;
    @Column(name = "categoria")
    private Categoria categoria;
    @Column(name = "idioma")
    private Idioma idioma;
    @Column(name = "classificacao")
    private Classificacao classificacao;
    @Column(name = "legenda")
    private Legenda legenda;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
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
    public Time getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(Time duracao) {
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
         
}
