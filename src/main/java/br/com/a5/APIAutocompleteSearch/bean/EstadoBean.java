package br.com.a5.APIAutocompleteSearch.bean;

public class EstadoBean {

	private String id;
	private String localizedName;

	public EstadoBean() {
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
		return "EstadoBean [id=" + id + ", localizedName=" + localizedName + "]";
	}

}
