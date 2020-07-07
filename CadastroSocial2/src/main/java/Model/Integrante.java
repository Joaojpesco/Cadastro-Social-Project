/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joaoj
 */
@Entity
@Table(name = "integrante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Integrante.findAll", query = "SELECT i FROM Integrante i"),
    @NamedQuery(name = "Integrante.findByIdintegrante", query = "SELECT i FROM Integrante i WHERE i.idintegrante = :idintegrante"),
    @NamedQuery(name = "Integrante.findByIdassistido", query = "SELECT i FROM Integrante i WHERE i.idassistido = :idassistido"),
    @NamedQuery(name = "Integrante.findByNomea", query = "SELECT i FROM Integrante i WHERE i.nomea = :nomea"),
    @NamedQuery(name = "Integrante.findByDatanascimento", query = "SELECT i FROM Integrante i WHERE i.datanascimento = :datanascimento"),
    @NamedQuery(name = "Integrante.findByParentesco", query = "SELECT i FROM Integrante i WHERE i.parentesco = :parentesco"),
    @NamedQuery(name = "Integrante.findByFrequenciacentro", query = "SELECT i FROM Integrante i WHERE i.frequenciacentro = :frequenciacentro"),
    @NamedQuery(name = "Integrante.findByEscolaridade", query = "SELECT i FROM Integrante i WHERE i.escolaridade = :escolaridade"),
    @NamedQuery(name = "Integrante.findByEstudando", query = "SELECT i FROM Integrante i WHERE i.estudando = :estudando")})
public class Integrante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idintegrante")
    private Integer idintegrante;
    @Basic(optional = false)
    @Column(name = "idassistido")
    private int idassistido;
    @Basic(optional = false)
    @Column(name = "nomea")
    private String nomea;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    private String datanascimento;
    @Basic(optional = false)
    @Column(name = "parentesco")
    private String parentesco;
    @Basic(optional = false)
    @Column(name = "frequenciacentro")
    private boolean frequenciacentro;
    @Basic(optional = false)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Basic(optional = false)
    @Column(name = "estudando")
    private boolean estudando;
    private String nomeassistido;
    public Integrante() {
    }

    public Integrante(Integer idintegrante) {
        this.idintegrante = idintegrante;
    }

    public Integrante(Integer idintegrante, int idassistido, String nomea, String datanascimento, String parentesco, boolean frequenciacentro, String escolaridade, boolean estudando) {
        this.idintegrante = idintegrante;
        this.idassistido = idassistido;
        this.nomea = nomea;
        this.datanascimento = datanascimento;
        this.parentesco = parentesco;
        this.frequenciacentro = frequenciacentro;
        this.escolaridade = escolaridade;
        this.estudando = estudando;
    }

    public Integer getIdintegrante() {
        return idintegrante;
    }

    public void setIdintegrante(Integer idintegrante) {
        this.idintegrante = idintegrante;
    }

    public int getIdassistido() {
        return idassistido;
    }

    public void setIdassistido(int idassistido) {
        this.idassistido = idassistido;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public boolean getFrequenciacentro() {
        return frequenciacentro;
    }

    public void setFrequenciacentro(boolean frequenciacentro) {
        this.frequenciacentro = frequenciacentro;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public boolean getEstudando() {
        return estudando;
    }

    public void setEstudando(boolean estudando) {
        this.estudando = estudando;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idintegrante != null ? idintegrante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Integrante)) {
            return false;
        }
        Integrante other = (Integrante) object;
        if ((this.idintegrante == null && other.idintegrante != null) || (this.idintegrante != null && !this.idintegrante.equals(other.idintegrante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Integrante[ idintegrante=" + idintegrante + " ]";
    }

    public String getNomeassistido() {
        return nomeassistido;
    }

    public void setNomeassistido(String nomeassistido) {
        this.nomeassistido = nomeassistido;
    }
    
}
