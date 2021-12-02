package Cliente;
import Conta.Conta;
public class Cliente {
	private String nome;
	private Endereco End;
	private Conta conta;
		
	public void setNome(String n) {this.nome = n;}
	public void setEndereco(Endereco e) { this.End = e; }
	public void setConta(Conta c) { this.conta = c; }
	
	public String getNome() {return this.nome;}
	public Endereco getEndereco() {return this.End;}
	public Conta getConta() {return this.conta;}
}
