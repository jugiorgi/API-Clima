package br.com.a5.APIAutocompleteSearch.bean;

public class PaisBean {

	private String id;
	private String localizedName;

	public PaisBean() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	@Override
	public String toString() {
		return "PaisBean [id=" + id + ", localizedName=" + localizedName + "]";
	}

}
