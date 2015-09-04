package curso.oo.lab11.ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Conta extends EntidadeBanco implements Comparable<Conta>{

	private Long identificador;

	private Integer numero;

	private double saldo;

	private Date dataAbertura;

	private Collection<Transacao> transacoes;

	private Cliente titular;

	private Agencia agencia;

	// construtor padrão da classe Conta que define a data de criação da conta e inicializa o array de transacao
	public Conta() {

		dataAbertura = UtilData.data();
		transacoes = new ArrayList<Transacao>();
	}

	// construtor com dois parametros
	public Conta( Cliente cliente, Integer nconta ) {

		this();
		numero = nconta;
		titular = cliente;
		saldo = 0.0; // Conta em reais e zerada
	}

	@Override
	public Long getIdentificador() {

		return identificador;
	}

	public void setIdentificador(Long identificador) {

		this.identificador = identificador;
	}

	public Integer getNumero() {

		return numero;
	}

	public void setNumero(Integer numero) {

		this.numero = numero;
	}

	public double getSaldo() {

		return saldo;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public Date getDataAbertura() {

		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {

		this.dataAbertura = dataAbertura;
	}

	public Collection<Transacao> getTransacoes() {

		return transacoes;
	}

	public void setTransacoes(Collection<Transacao> transacoes) {

		this.transacoes = transacoes;
	}

	public Cliente getTitular() {

		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Agencia getAgencia() {

		return agencia;
	}

	public void setAgencia(Agencia agencia) {

		this.agencia = agencia;
	}

	/**
	 * Testa a igualdade de um objeto com este
	 */
	@Override
	public boolean equals(Object objeto) {

		boolean resultado = false;
		if (( objeto != null ) && ( objeto instanceof Conta )) {
			Conta c = (Conta) objeto;
			if (getNumero() == c.getNumero()) {
				resultado = true;
			}
		}
		return resultado;
	}

	/**
	 * Gera código hash para tabelas de epalhamento
	 */
	@Override
	public int hashCode() {

		return getNumero();
	}

	@Override
	public String toString() {

		return getNumero() + "-" + getTitular().getNome();
	}

	@Override
	public int compareTo(Conta o) {

		// comparando somente campo nome
		return getNumero().compareTo(o.getNumero());
	}

}
