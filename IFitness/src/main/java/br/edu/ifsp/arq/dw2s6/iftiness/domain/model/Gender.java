package br.edu.ifsp.arq.dw2s6.iftiness.domain.model;

public enum Gender {

	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer"); //em parentesis é a descrição
	
	private String description;
	
	private Gender(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
}
