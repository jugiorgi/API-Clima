package br.com.a5.APIAutocompleteSearch.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APIAutocompleteSearch.bean.Bean;
import br.com.a5.APIAutocompleteSearch.bean.EstadoBean;
import br.com.a5.APIAutocompleteSearch.bean.PaisBean;

public class Conexao {

	private Bean bean;
	private PaisBean paisBean;
	private EstadoBean estadoBean;

	public String consultaAutoCompleta(String q) {
		String apikey = "TN8fVimWVtZLMD5hk8UGo3q6ooesEqb5";
		String url = "http://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=" + apikey + "&q=" + q;
		JSONArray jsonArray;
		JSONObject json;

		List<Bean> lista = new ArrayList<Bean>();

		try {
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(url);
			HttpResponse response = httpClient.execute(httpGet);
			String responseString = new BasicResponseHandler().handleResponse(response);
			jsonArray = new JSONArray(responseString);

			System.out.println("Quantidade: " + jsonArray.length());
			for (int i = 0; i < jsonArray.length(); i++) {
				bean = new Bean();
				paisBean = new PaisBean();
				estadoBean = new EstadoBean();
				
				String jsonString = jsonArray.getString(i);
				json = new JSONObject(jsonString);

				bean.setVersion(json.getInt("Version"));
				bean.setKey(json.getString("Key"));
				bean.setType(json.getString("Type"));
				bean.setRank(json.getInt("Rank"));
				bean.setLocalizedName(json.getString("LocalizedName"));

				JSONObject jsonPais = new JSONObject(json.get("Country").toString());
				paisBean.setId(jsonPais.getString("ID"));
				paisBean.setLocalizedName(jsonPais.getString("LocalizedName"));
				bean.setPais(paisBean);

				JSONObject jsonEstado = new JSONObject(json.get("AdministrativeArea").toString());
				estadoBean.setId(jsonEstado.getString("ID"));
				estadoBean.setLocalizedName(jsonEstado.getString("LocalizedName"));
				bean.setEstado(estadoBean);

				lista.add(bean);
			}
			System.out.println("Lista: " + lista.toString());
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
