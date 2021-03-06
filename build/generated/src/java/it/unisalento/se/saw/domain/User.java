package it.unisalento.se.saw.domain;
// Generated 25-lug-2018 15.58.37 by Hibernate Tools 5.2.0.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="se_db"
)
public class User  implements java.io.Serializable {


     private Integer iduser;
     private CorsoDiStudio corsoDiStudio;
     private UserType userType;
     private String name;
     private String surname;
     private String email;
     private String password;
     private Date dataDiNascita;
     private Integer matricola;
     private String indirizzo;
     private String telefono;
     private Set<Recensione> recensiones = new HashSet<Recensione>(0);
     private Set<Insegnamento> insegnamentos = new HashSet<Insegnamento>(0);
     private Set<Segnalazione> segnalaziones = new HashSet<Segnalazione>(0);

    public User() {
    }

    public User(CorsoDiStudio corsoDiStudio, UserType userType, String name, String surname, String email, String password, Date dataDiNascita, Integer matricola, String indirizzo, String telefono, Set<Recensione> recensiones, Set<Insegnamento> insegnamentos, Set<Segnalazione> segnalaziones) {
       this.corsoDiStudio = corsoDiStudio;
       this.userType = userType;
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.password = password;
       this.dataDiNascita = dataDiNascita;
       this.matricola = matricola;
       this.indirizzo = indirizzo;
       this.telefono = telefono;
       this.recensiones = recensiones;
       this.insegnamentos = insegnamentos;
       this.segnalaziones = segnalaziones;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iduser", unique=true, nullable=false)
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_corso_di_studio")
    public CorsoDiStudio getCorsoDiStudio() {
        return this.corsoDiStudio;
    }
    
    public void setCorsoDiStudio(CorsoDiStudio corsoDiStudio) {
        this.corsoDiStudio = corsoDiStudio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type")
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="surname", length=45)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_di_nascita", length=10)
    public Date getDataDiNascita() {
        return this.dataDiNascita;
    }
    
    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    
    @Column(name="matricola")
    public Integer getMatricola() {
        return this.matricola;
    }
    
    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    
    @Column(name="indirizzo", length=45)
    public String getIndirizzo() {
        return this.indirizzo;
    }
    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    
    @Column(name="telefono", length=45)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Recensione> getRecensiones() {
        return this.recensiones;
    }
    
    public void setRecensiones(Set<Recensione> recensiones) {
        this.recensiones = recensiones;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Insegnamento> getInsegnamentos() {
        return this.insegnamentos;
    }
    
    public void setInsegnamentos(Set<Insegnamento> insegnamentos) {
        this.insegnamentos = insegnamentos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Segnalazione> getSegnalaziones() {
        return this.segnalaziones;
    }
    
    public void setSegnalaziones(Set<Segnalazione> segnalaziones) {
        this.segnalaziones = segnalaziones;
    }




}


