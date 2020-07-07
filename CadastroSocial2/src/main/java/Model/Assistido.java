/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
@Table(name = "assistido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assistido.findAll", query = "SELECT a FROM Assistido a"),
    @NamedQuery(name = "Assistido.findByIdassistido", query = "SELECT a FROM Assistido a WHERE a.idassistido = :idassistido"),
    @NamedQuery(name = "Assistido.findByNome", query = "SELECT a FROM Assistido a WHERE a.nome = :nome"),
    @NamedQuery(name = "Assistido.findByFoto", query = "SELECT a FROM Assistido a WHERE a.foto = :foto"),
    @NamedQuery(name = "Assistido.findByRg", query = "SELECT a FROM Assistido a WHERE a.rg = :rg"),
    @NamedQuery(name = "Assistido.findByCpf", query = "SELECT a FROM Assistido a WHERE a.cpf = :cpf"),
    @NamedQuery(name = "Assistido.findByDatanascimentoa", query = "SELECT a FROM Assistido a WHERE a.datanascimentoa = :datanascimentoa"),
    @NamedQuery(name = "Assistido.findByEndereco", query = "SELECT a FROM Assistido a WHERE a.endereco = :endereco"),
    @NamedQuery(name = "Assistido.findByBairro", query = "SELECT a FROM Assistido a WHERE a.bairro = :bairro"),
    @NamedQuery(name = "Assistido.findByCep", query = "SELECT a FROM Assistido a WHERE a.cep = :cep"),
    @NamedQuery(name = "Assistido.findByCidade", query = "SELECT a FROM Assistido a WHERE a.cidade = :cidade"),
    @NamedQuery(name = "Assistido.findByTelefone", query = "SELECT a FROM Assistido a WHERE a.telefone = :telefone"),
    @NamedQuery(name = "Assistido.findByEstadocivil", query = "SELECT a FROM Assistido a WHERE a.estadocivil = :estadocivil"),
    @NamedQuery(name = "Assistido.findByEscolaridade", query = "SELECT a FROM Assistido a WHERE a.escolaridade = :escolaridade"),
    @NamedQuery(name = "Assistido.findByBolsafamilia", query = "SELECT a FROM Assistido a WHERE a.bolsafamilia = :bolsafamilia"),
    @NamedQuery(name = "Assistido.findByCadastrorendacidada", query = "SELECT a FROM Assistido a WHERE a.cadastrorendacidada = :cadastrorendacidada"),
    @NamedQuery(name = "Assistido.findByCadunico", query = "SELECT a FROM Assistido a WHERE a.cadunico = :cadunico"),
    @NamedQuery(name = "Assistido.findByDoencas", query = "SELECT a FROM Assistido a WHERE a.doencas = :doencas"),
    @NamedQuery(name = "Assistido.findByTrabalha", query = "SELECT a FROM Assistido a WHERE a.trabalha = :trabalha"),
    @NamedQuery(name = "Assistido.findByAposentado", query = "SELECT a FROM Assistido a WHERE a.aposentado = :aposentado"),
    @NamedQuery(name = "Assistido.findByPensao", query = "SELECT a FROM Assistido a WHERE a.pensao = :pensao"),
    @NamedQuery(name = "Assistido.findByObs", query = "SELECT a FROM Assistido a WHERE a.obs = :obs"),
    @NamedQuery(name = "Assistido.findBySexo", query = "SELECT a FROM Assistido a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Assistido.findByGravida", query = "SELECT a FROM Assistido a WHERE a.gravida = :gravida")})
public class Assistido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idassistido")
    private Integer idassistido;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "foto")
    private String foto;
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "datanascimentoa")
    private String datanascimentoa;
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
    @Column(name = "estadocivil")
    private String estadocivil;
    @Basic(optional = false)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Basic(optional = false)
    @Column(name = "bolsafamilia")
    private boolean bolsafamilia;
    @Basic(optional = false)
    @Column(name = "cadastrorendacidada")
    private boolean cadastrorendacidada;
    @Basic(optional = false)
    @Column(name = "cadunico")
    private boolean cadunico;
    @Basic(optional = false)
    @Column(name = "doencas")
    private String doencas;
    @Basic(optional = false)
    @Column(name = "trabalha")
    private String trabalha;
    @Basic(optional = false)
    @Column(name = "aposentado")
    private boolean aposentado;
    @Basic(optional = false)
    @Column(name = "pensao")
    private boolean pensao;
    @Column(name = "obs")
    private String obs;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "gravida")
    private Boolean gravida;
    private int idade;
    private String nomecrianca;

    public Assistido() {
    }

    public Assistido(Integer idassistido) {
        this.idassistido = idassistido;
    }

    public Assistido(Integer idassistido, String nome, String rg, String cpf, String datanascimentoa, String endereco, String bairro, String cep, String cidade, String telefone, String estadocivil, String escolaridade, boolean bolsafamilia, boolean cadastrorendacidada, boolean cadunico, String doencas, String trabalha, boolean aposentado, boolean pensao) {
        this.idassistido = idassistido;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.datanascimentoa = datanascimentoa;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.estadocivil = estadocivil;
        this.escolaridade = escolaridade;
        this.bolsafamilia = bolsafamilia;
        this.cadastrorendacidada = cadastrorendacidada;
        this.cadunico = cadunico;
        this.doencas = doencas;
        this.trabalha = trabalha;
        this.aposentado = aposentado;
        this.pensao = pensao;
    }

    public Integer getIdassistido() {
        return idassistido;
    }

    public void setIdassistido(Integer idassistido) {
        this.idassistido = idassistido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimentoa() {
        return datanascimentoa;
    }

    public void setDatanascimentoa(String datanascimentoa) {
        this.datanascimentoa = datanascimentoa;
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

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public boolean getBolsafamilia() {
        return bolsafamilia;
    }

    public void setBolsafamilia(boolean bolsafamilia) {
        this.bolsafamilia = bolsafamilia;
    }

    public boolean getCadastrorendacidada() {
        return cadastrorendacidada;
    }

    public void setCadastrorendacidada(boolean cadastrorendacidada) {
        this.cadastrorendacidada = cadastrorendacidada;
    }

    public boolean getCadunico() {
        return cadunico;
    }

    public void setCadunico(boolean cadunico) {
        this.cadunico = cadunico;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String trabalha) {
        this.trabalha = trabalha;
    }

    public boolean getAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    public boolean getPensao() {
        return pensao;
    }

    public void setPensao(boolean pensao) {
        this.pensao = pensao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getGravida() {
        return gravida;
    }

    public void setGravida(Boolean gravida) {
        this.gravida = gravida;
    }
    public static int Idade(String n) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date data = new java.sql.Date(format.parse(n).getTime()); 
        Calendar cData = Calendar.getInstance();
        Calendar cHoje= Calendar.getInstance();
        cData.setTime(data);
        cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
        int idade = cData.after(cHoje) ? -1 : 0;
        cData.setTime(data);
        idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
        return idade;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idassistido != null ? idassistido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assistido)) {
            return false;
        }
        Assistido other = (Assistido) object;
        if ((this.idassistido == null && other.idassistido != null) || (this.idassistido != null && !this.idassistido.equals(other.idassistido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Assistido[ idassistido=" + idassistido + " ]";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomecrianca() {
        return nomecrianca;
    }

    public void setNomecrianca(String nomecrianca) {
        this.nomecrianca = nomecrianca;
    }

    
    
}
