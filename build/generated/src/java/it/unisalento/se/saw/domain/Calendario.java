package it.unisalento.se.saw.domain;
// Generated 25-lug-2018 15.58.37 by Hibernate Tools 5.2.0.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Calendario generated by hbm2java
 */
@Entity
@Table(name="calendario"
    ,catalog="se_db"
)
public class Calendario  implements java.io.Serializable {


     private int idcalendario;
     private String tipo;
     private Set<Lezione> leziones = new HashSet<Lezione>(0);

    public Calendario() {
    }

	
    public Calendario(int idcalendario) {
        this.idcalendario = idcalendario;
    }
    public Calendario(int idcalendario, String tipo, Set<Lezione> leziones) {
       this.idcalendario = idcalendario;
       this.tipo = tipo;
       this.leziones = leziones;
    }
   
     @Id 

    
    @Column(name="idcalendario", unique=true, nullable=false)
    public int getIdcalendario() {
        return this.idcalendario;
    }
    
    public void setIdcalendario(int idcalendario) {
        this.idcalendario = idcalendario;
    }

    
    @Column(name="tipo", length=45)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="calendario")
    public Set<Lezione> getLeziones() {
        return this.leziones;
    }
    
    public void setLeziones(Set<Lezione> leziones) {
        this.leziones = leziones;
    }




}

