
public class Licitacao {
	
	private String cdLicitacao;
	private String valor;
	private String cdItem;
	private String cdLote;
	
	public Licitacao() {
		
	}
	
	public Licitacao(String cdLicitacao, String valor, String cdItem, String cdLote) {
		super();
		this.cdLicitacao = cdLicitacao;
		this.valor = valor;
		this.cdItem = cdItem;
		this.cdLote = cdLote;
	}

	public String getCdLicitacao() {
		return cdLicitacao;
	}

	public void setCdLicitacao(String cdLicitacao) {
		this.cdLicitacao = cdLicitacao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCdItem() {
		return cdItem;
	}

	public void setCdItem(String cdItem) {
		this.cdItem = cdItem;
	}

	public String getCdLote() {
		return cdLote;
	}

	public void setCdLote(String cdLote) {
		this.cdLote = cdLote;
	}
	
}

