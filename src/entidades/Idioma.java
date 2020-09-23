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
@Table(name = "idioma")

public class Idioma implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "idioma")
    private String idioma;

 
    @Override
    public String toString(){
        return this.idioma;
    }
    
    /**
     * @return the id
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the id to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
