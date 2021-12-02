package Cliente;

public class Endereco {
	private String pais;
	private String cidade;
	private String rua;
	private int num;
	
	public Endereco(String pais, String cidade, String rua, int num) {
		this.pais = pais;
		this.cidade = cidade;
		this.rua = rua;
		this.num = num;
	}
	
	public void setPais(String p){ this.pais = p; }
	public void setCidade(String c) { this.cidade = c; }
	public void setRua(String r) { this.rua = r; }
	public void setNum(int n) { this.num = n; }
	
	public String getPais() {return this.pais;}
	public String getCidade() {return this.cidade;}
	public String getRua() {return this.rua;}
	public int getNum() {return this.num;}
}
