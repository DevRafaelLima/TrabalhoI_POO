package Conta;

public class Conta {
	private int numConta;
	private String dataAbertura;
	private String dataEncerramento;
	private boolean situacao;
	private String senha;
	private double saldo;
	
	//metodo modificadores
	public void setNumConta(int n) {this.numConta = n;}
	public void setDataAbertura(String data) {this.dataAbertura = data;}
	public void setDataEncerramento(String data) {this.dataEncerramento = data;}
	public void setSituacao(boolean x) {this.situacao = x;}
	public void setSenha(String s) {this.senha = s;}
	public void setSaldo(double x) {this.saldo = x;}
	
	//Métodos acessores
	public int getNumConta() {return this.numConta;}
	public String getDataAbertura() {return this.dataAbertura;}
	public String getDataEncerramento() {return this.dataEncerramento;}
	public boolean getSituacao() {return this.situacao;}
	public String getSenha() {return this.senha;}
	public double getSaldo() {return this.saldo;}
}
