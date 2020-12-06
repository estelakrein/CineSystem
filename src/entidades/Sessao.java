/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
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
@Table(name = "sessao")

public class Sessao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "horario")
    private GregorianCalendar horario;
    @Column(name = "dia")
    private GregorianCalendar data;
    @Column(name = "valor")
    private double valor;
    @Column(name = "codSala")
    private int sala;
    @Column(name = "codFilme")
    private int filme;
    
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
     * @return the horario
     */
    public GregorianCalendar getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(GregorianCalendar horario) {
        this.horario = horario;
    }

    /**
     * @return the data
     */
    public GregorianCalendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the numero to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the sala
     */
    public int getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(int sala) {
        this.sala = sala;
    }

    /**
     * @return the filme
     */
    public int getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(int filme) {
        this.filme = filme;
    }
    
}
