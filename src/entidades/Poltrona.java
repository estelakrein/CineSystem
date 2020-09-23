/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
@Table(name = "poltrona")

public class Poltrona {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "codSala")
    private int sala;
    @Column(name = "fileira")
    private String fileira;
    @Column(name = "numero")
    private int numero;

 
    @Override
    public String toString(){
        return this.getDescricao();
    }

    /**
     * @return the codigo
     */
    public String getDescricao() {
        return this.fileira + " - " + String.valueOf(this.numero);
    }
    
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
     * @return the fileira
     */
    public String getFileira() {
        return fileira;
    }

    /**
     * @param fileira the fileira to set
     */
    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
