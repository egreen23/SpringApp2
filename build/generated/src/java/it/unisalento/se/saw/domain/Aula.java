package it.unisalento.se.saw.domain;
// Generated 25-lug-2018 15.58.37 by Hibernate Tools 5.2.0.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Aula generated by hbm2java
 */
@Entity
@Table(name="aula"
    ,catalog="se_db"
)
public class Aula  implements java.io.Serializable {


     private Integer idaula;
     private String nome;
     private Long longitudine;
     private Long latitudine;
     private String edificio;
     private Set<Segnalazione> segnalaziones = new HashSet<Segnalazione>(0);
     private Set<Tool> tools = new HashSet<Tool>(0);
     private Set<Lezione> leziones = new HashSet<Lezione>(0);

    public Aula() {
    }

    public Aula(String nome, Long longitudine, Long latitudine, String edificio, Set<Segnalazione> segnalaziones, Set<Tool> tools, Set<Lezione> leziones) {
       this.nome = nome;
       this.longitudine = longitudine;
       this.latitudine = latitudine;
       this.edificio = edificio;
       this.segnalaziones = segnalaziones;
       this.tools = tools;
       this.leziones = leziones;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idaula", unique=true, nullable=false)
    public Integer getIdaula() {
        return this.idaula;
    }
    
    public void setIdaula(Integer idaula) {
        this.idaula = idaula;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="longitudine", precision=10, scale=0)
    public Long getLongitudine() {
        return this.longitudine;
    }
    
    public void setLongitudine(Long longitudine) {
        this.longitudine = longitudine;
    }

    
    @Column(name="latitudine", precision=10, scale=0)
    public Long getLatitudine() {
        return this.latitudine;
    }
    
    public void setLatitudine(Long latitudine) {
        this.latitudine = latitudine;
    }

    
    @Column(name="edificio", length=45)
    public String getEdificio() {
        return this.edificio;
    }
    
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aula")
    public Set<Segnalazione> getSegnalaziones() {
        return this.segnalaziones;
    }
    
    public void setSegnalaziones(Set<Segnalazione> segnalaziones) {
        this.segnalaziones = segnalaziones;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aula")
    public Set<Tool> getTools() {
        return this.tools;
    }
    
    public void setTools(Set<Tool> tools) {
        this.tools = tools;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aula")
    public Set<Lezione> getLeziones() {
        return this.leziones;
    }
    
    public void setLeziones(Set<Lezione> leziones) {
        this.leziones = leziones;
    }




}

