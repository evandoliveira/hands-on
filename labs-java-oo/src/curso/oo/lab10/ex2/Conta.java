package curso.oo.lab10.ex2;

import java.util.Date;

public class Conta extends EntidadeBanco {

	private Long identificador;

	private int numero;

	private String titular;

	private Date dataAbertura;

	private double saldo;

	private Movimento<Transacao> movimento;

	// construtor padrão da classe Conta que define a data de criação da conta e
	// inicializa o array de transacao
	public Conta() {

		dataAbertura = UtilData.data();
		movimento = new Movimento<Transacao>();
	}

	// construtor com dois parametros
	public Conta(String nome, int nconta) {

		this();
		numero = nconta;
		titular = nome;
		saldo = 0.0; // Conta em reais e zerada
	}

	@Override
	public Long getIdentificador() {

		return identificador;
	}

	public void setIdentificador(Long identificador) {

		this.identificador = identificador;
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public String getTitular() {

		return titular;
	}

	public void setTitular(String titular) {

		this.titular = titular;
	}

	public Date getDataAbertura() {

		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {

		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {

		return saldo;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public Movimento<Transacao> getMovimento() {
		
		return movimento;
	}

	public void setMovimento(Movimento<Transacao> movimento) {
		
		this.movimento = movimento;
	}

}
