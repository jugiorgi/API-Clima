package br.com.a5.APIAutocompleteSearch.bean;

public class Bean {

	private Integer version;
	private String key;
	private String type;
	private Integer rank;
	private String localizedName;
	private PaisBean pais;
	private EstadoBean estado;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public PaisBean getPais() {
		return pais;
	}

	public void setPais(PaisBean pais) {
		this.pais = pais;
	}

	public EstadoBean getEstado() {
		return estado;
	}

	public void setEstado(EstadoBean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Bean [version=" + version + ", key=" + key + ", type=" + type + ", rank=" + rank + ", localizedName="
				+ localizedName + ", pais=" + pais + ", estado=" + estado + "]";
	}

}
