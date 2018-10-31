package br.com.senai.tcc.iestock.entidade;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cliente   {
	
	//Atributos
	@Id
	@GeneratedValue(generator = "cliente_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String nLoja;
	@Enumerated(EnumType.STRING)
	private EnumTipoPessoa enumTipoPessoa;	
	private String cCpfCnpj;
	private String cRg;
	@Temporal(TemporalType.DATE)
	private Date dDataNascimento;
	private String cInscEst;
	private String cInscMun;
	@OneToOne
	private Endereco oEndereco;
	private String cContato;
	private String cEmail;
	private int  cDdd;
	private String cTelefone;
	private String cBanco;
	private String cAgencia;
	private String cConta;
	private String cDVagencia;
	private String cDVconta;	
	@Temporal(TemporalType.DATE)
	private Date dDataUltCompra;
	private float nLimiteCredito;
	@Enumerated(EnumType.STRING)
	private EnumStatus enumStatusCliente;
	
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getcCodigo() {
		return cCodigo;
	}
	public void setcCodigo(String cCodigo) {
		this.cCodigo = cCodigo;
	}
	public String getnLoja() {
		return nLoja;
	}
	public void setnLoja(String nLoja) {
		this.nLoja = nLoja;
	}
	public EnumTipoPessoa getEnumTipoPessoa() {
		return enumTipoPessoa;
	}
	public void setEnumTipoPessoa(EnumTipoPessoa enumTipoPessoa) {
		this.enumTipoPessoa = enumTipoPessoa;
	}
	public String getcCpfCnpj() {
		return cCpfCnpj;
	}
	public void setcCpfCnpj(String cCpfCnpj) {
		this.cCpfCnpj = cCpfCnpj;
	}
	public String getcRg() {
		return cRg;
	}
	public void setcRg(String cRg) {
		this.cRg = cRg;
	}
	public Date getdDataNascimento() {
		return dDataNascimento;
	}
	public void setdDataNascimento(Date dDataNascimento) {
		this.dDataNascimento = dDataNascimento;
	}
	public String getcInscEst() {
		return cInscEst;
	}
	public void setcInscEst(String cInscEst) {
		this.cInscEst = cInscEst;
	}
	public String getcInscMun() {
		return cInscMun;
	}
	public void setcInscMun(String cInscMun) {
		this.cInscMun = cInscMun;
	}
	public Endereco getoEndereco() {
		return oEndereco;
	}
	public void setoEndereco(Endereco oEndereco) {
		this.oEndereco = oEndereco;
	}
	public String getcContato() {
		return cContato;
	}
	public void setcContato(String cContato) {
		this.cContato = cContato;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public int getcDdd() {
		return cDdd;
	}
	public void setcDdd(int cDdd) {
		this.cDdd = cDdd;
	}
	public String getcTelefone() {
		return cTelefone;
	}
	public void setcTelefone(String cTelefone) {
		this.cTelefone = cTelefone;
	}
	public String getcBanco() {
		return cBanco;
	}
	public void setcBanco(String cBanco) {
		this.cBanco = cBanco;
	}
	public String getcAgencia() {
		return cAgencia;
	}
	public void setcAgencia(String cAgencia) {
		this.cAgencia = cAgencia;
	}
	public String getcConta() {
		return cConta;
	}
	public void setcConta(String cConta) {
		this.cConta = cConta;
	}
	public String getcDVagencia() {
		return cDVagencia;
	}
	public void setcDVagencia(String cDVagencia) {
		this.cDVagencia = cDVagencia;
	}
	public String getcDVconta() {
		return cDVconta;
	}
	public void setcDVconta(String cDVconta) {
		this.cDVconta = cDVconta;
	}
	public Date getdDataUltCompra() {
		return dDataUltCompra;
	}
	public void setdDataUltCompra(Date dDataUltCompra) {
		this.dDataUltCompra = dDataUltCompra;
	}
	public float getnLimiteCredito() {
		return nLimiteCredito;
	}
	public void setnLimiteCredito(float nLimiteCredito) {
		this.nLimiteCredito = nLimiteCredito;
	}
	public EnumStatus getEnumStatusCliente() {
		return enumStatusCliente;
	}
	public void setEnumStatusCliente(EnumStatus enumStatusCliente) {
		this.enumStatusCliente = enumStatusCliente;
	}
}


