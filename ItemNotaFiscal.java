package lab;

public class ItemNotaFiscal {
	
	private int numeroItem;
	private String codigo;
	private String descricao;
	private double quantidade;
	private String unidadeMedida;
	private double valorUnitario;
	private double valorTributo;
	private double ValorItem;
	
	public ItemNotaFiscal() {
		//construtor padrao
	}
	
	public ItemNotaFiscal(int numeroItem, String codigo, String descricao, double quantidade, String unidadeMedida, double valorUnitario, double valorTributo) {
	this.numeroItem = numeroItem;
	this.codigo = codigo;
	this.descricao = descricao;
	this.quantidade = quantidade;
	this.unidadeMedida = unidadeMedida;
	this.valorUnitario = valorUnitario;
	this.valorTributo = valorTributo;
	this.ValorItem = calcularValorItem();
	}
	
	
	public double calcularValorItem() {
		return this.quantidade * this.valorUnitario;
	}
	
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public String getcodigo() {
		return codigo;
	}
	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getquantidade() {
		return quantidade;
	}
	public void setquantidade(double quantidade) {
		this.quantidade = quantidade;
		this.ValorItem = calcularValorItem();
	}
	public String getunidadeMedida() {
		return unidadeMedida;
	}
	public void setunidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public double getvalorUnitario() {
		return valorUnitario;
	}
	public void setvalorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
		this.ValorItem = calcularValorItem();
	}
	public double getvalorTributo() {
		return valorTributo;
	}
	public void setvalorTributo(double valorTributo) {
		this.valorTributo = valorTributo;
	}
	public double getValorItem() {
		return ValorItem;
	}
	public void setValorItem(double ValorItem) {
		this.ValorItem = ValorItem;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
