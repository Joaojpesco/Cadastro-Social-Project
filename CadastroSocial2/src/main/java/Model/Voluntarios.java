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
@Table(name = "voluntarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voluntarios.findAll", query = "SELECT v FROM Voluntarios v"),
    @NamedQuery(name = "Voluntarios.findByIdvoluntario", query = "SELECT v FROM Voluntarios v WHERE v.idvoluntario = :idvoluntario"),
    @NamedQuery(name = "Voluntarios.findByNome", query = "SELECT v FROM Voluntarios v WHERE v.nome = :nome"),
    @NamedQuery(name = "Voluntarios.findByDatanascimento", query = "SELECT v FROM Voluntarios v WHERE v.datanascimento = :datanascimento"),
    @NamedQuery(name = "Voluntarios.findByEndereco", query = "SELECT v FROM Voluntarios v WHERE v.endereco = :endereco"),
    @NamedQuery(name = "Voluntarios.findByBairro", query = "SELECT v FROM Voluntarios v WHERE v.bairro = :bairro"),
    @NamedQuery(name = "Voluntarios.findByCep", query = "SELECT v FROM Voluntarios v WHERE v.cep = :cep"),
    @NamedQuery(name = "Voluntarios.findByCidade", query = "SELECT v FROM Voluntarios v WHERE v.cidade = :cidade"),
    @NamedQuery(name = "Voluntarios.findByTelefone", query = "SELECT v FROM Voluntarios v WHERE v.telefone = :telefone"),
    @NamedQuery(name = "Voluntarios.findByCategoria", query = "SELECT v FROM Voluntarios v WHERE v.categoria = :categoria")})
public class Voluntarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvoluntario")
    private Integer idvoluntario;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    private String datanascimento;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Voluntarios() {
    }

    public Voluntarios(Integer idvoluntario) {
        this.idvoluntario = idvoluntario;
    }

    public Voluntarios(Integer idvoluntario, String nome, String datanascimento, String endereco, String bairro, String cep, String cidade, String telefone, String categoria) {
        this.idvoluntario = idvoluntario;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public Integer getIdvoluntario() {
        return idvoluntario;
    }

    public void setIdvoluntario(Integer idvoluntario) {
        this.idvoluntario = idvoluntario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvoluntario != null ? idvoluntario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voluntarios)) {
            return false;
        }
        Voluntarios other = (Voluntarios) object;
        if ((this.idvoluntario == null && other.idvoluntario != null) || (this.idvoluntario != null && !this.idvoluntario.equals(other.idvoluntario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Voluntarios[ idvoluntario=" + idvoluntario + " ]";
    }
    
}
