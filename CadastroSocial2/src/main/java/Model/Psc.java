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
@Table(name = "psc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Psc.findAll", query = "SELECT p FROM Psc p"),
    @NamedQuery(name = "Psc.findByIdpsc", query = "SELECT p FROM Psc p WHERE p.idpsc = :idpsc"),
    @NamedQuery(name = "Psc.findByNome", query = "SELECT p FROM Psc p WHERE p.nome = :nome"),
    @NamedQuery(name = "Psc.findByEndereco", query = "SELECT p FROM Psc p WHERE p.endereco = :endereco"),
    @NamedQuery(name = "Psc.findByBairro", query = "SELECT p FROM Psc p WHERE p.bairro = :bairro"),
    @NamedQuery(name = "Psc.findByCep", query = "SELECT p FROM Psc p WHERE p.cep = :cep"),
    @NamedQuery(name = "Psc.findByCidade", query = "SELECT p FROM Psc p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "Psc.findByTelefone", query = "SELECT p FROM Psc p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Psc.findByVaracriminal", query = "SELECT p FROM Psc p WHERE p.varacriminal = :varacriminal"),
    @NamedQuery(name = "Psc.findByDatainicio", query = "SELECT p FROM Psc p WHERE p.datainicio = :datainicio"),
    @NamedQuery(name = "Psc.findByDataencerramento", query = "SELECT p FROM Psc p WHERE p.dataencerramento = :dataencerramento"),
    @NamedQuery(name = "Psc.findByMedidaimposta", query = "SELECT p FROM Psc p WHERE p.medidaimposta = :medidaimposta"),
    @NamedQuery(name = "Psc.findByDiassemana", query = "SELECT p FROM Psc p WHERE p.diassemana = :diassemana"),
    @NamedQuery(name = "Psc.findByHorarios", query = "SELECT p FROM Psc p WHERE p.horarios = :horarios"),
    @NamedQuery(name = "Psc.findByMedidaimpostatotal", query = "SELECT p FROM Psc p WHERE p.medidaimpostatotal = :medidaimpostatotal")})
public class Psc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpsc")
    private Integer idpsc;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
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
    @Column(name = "varacriminal")
    private String varacriminal;
    @Basic(optional = false)
    @Column(name = "datainicio")
    private String datainicio;
    @Basic(optional = false)
    @Column(name = "dataencerramento")
    private String dataencerramento;
    @Basic(optional = false)
    @Column(name = "medidaimposta")
    private String medidaimposta;
    @Basic(optional = false)
    @Column(name = "diassemana")
    private String diassemana;
    @Basic(optional = false)
    @Column(name = "horarios")
    private String horarios;
    @Basic(optional = false)
    @Column(name = "medidaimpostatotal")
    private String medidaimpostatotal;

    public Psc() {
    }

    public Psc(Integer idpsc) {
        this.idpsc = idpsc;
    }

    public Psc(Integer idpsc, String nome, String endereco, String bairro, String cep, String cidade, String telefone, String varacriminal, String datainicio, String dataencerramento, String medidaimposta, String diassemana, String horarios, String medidaimpostatotal) {
        this.idpsc = idpsc;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.varacriminal = varacriminal;
        this.datainicio = datainicio;
        this.dataencerramento = dataencerramento;
        this.medidaimposta = medidaimposta;
        this.diassemana = diassemana;
        this.horarios = horarios;
        this.medidaimpostatotal = medidaimpostatotal;
    }

    public Integer getIdpsc() {
        return idpsc;
    }

    public void setIdpsc(Integer idpsc) {
        this.idpsc = idpsc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getVaracriminal() {
        return varacriminal;
    }

    public void setVaracriminal(String varacriminal) {
        this.varacriminal = varacriminal;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDataencerramento() {
        return dataencerramento;
    }

    public void setDataencerramento(String dataencerramento) {
        this.dataencerramento = dataencerramento;
    }

    public String getMedidaimposta() {
        return medidaimposta;
    }

    public void setMedidaimposta(String medidaimposta) {
        this.medidaimposta = medidaimposta;
    }

    public String getDiassemana() {
        return diassemana;
    }

    public void setDiassemana(String diassemana) {
        this.diassemana = diassemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getMedidaimpostatotal() {
        return medidaimpostatotal;
    }

    public void setMedidaimpostatotal(String medidaimpostatotal) {
        this.medidaimpostatotal = medidaimpostatotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpsc != null ? idpsc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Psc)) {
            return false;
        }
        Psc other = (Psc) object;
        if ((this.idpsc == null && other.idpsc != null) || (this.idpsc != null && !this.idpsc.equals(other.idpsc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Psc[ idpsc=" + idpsc + " ]";
    }
    
}
