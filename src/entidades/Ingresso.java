/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author estel
 */
@Entity
@Table(name = "ingresso")
public class Ingresso implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "codSessao")
    private int sessao;
    @Column(name = "codPoltrona")
    private int poltrona;
    @Column(name = "codVenda")
    private int venda;
    @Column(name = "valor")
    private double valor;

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
     * @return the Sessao
     */
    public int getSessao() {
        return sessao;
    }

    /**
     * @param Sessao the Sessao to set
     */
    public void setSessao(int Sessao) {
        this.sessao = Sessao;
    }

    /**
     * @return the Poltrona
     */
    public int getPoltrona() {
        return poltrona;
    }

    /**
     * @param Poltrona the Poltrona to set
     */
    public void setPoltrona(int Poltrona) {
        this.poltrona = Poltrona;
    }

    /**
     * @return the venda
     */
    public int getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(int venda) {
        this.venda = venda;
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
