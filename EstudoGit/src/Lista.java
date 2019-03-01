import java.util.HashMap;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Primeira alteração!!");
		System.out.println("Segunda alteração!!");
		
		Licitacao licit1 = new Licitacao("1501012019000001", "750.00", "123", "456");
		Licitacao licit2 = new Licitacao("1601012019000002", "880.00", "789", "321");
		Licitacao licit3 = new Licitacao("1701012019000003", "1410.00", "012", "987");
		
		HashMap<String, Boolean> hashStatusDoObjeto1 = new HashMap<String, Boolean>();
		hashStatusDoObjeto1.put(licit1.getCdLicitacao(), true);

		HashMap<String, Object> hashValorDoObjeto1 = new HashMap<String, Object>();
		hashValorDoObjeto1.put(licit1.getCdLicitacao(), licit1);
		
		HashMap<HashMap<String, Boolean>, HashMap<String, Object>> hashLicitacao = new  HashMap<HashMap<String, Boolean>, HashMap<String, Object>>();
		hashLicitacao.put(hashStatusDoObjeto1, hashValorDoObjeto1);
		
//		hashLicitacao.get(new  HashMap("1501012019000001", true));
		
		System.out.println((hashStatusDoObjeto1.get("1501012019000001").booleanValue()) ? "sim" : "nao");
	}

}
