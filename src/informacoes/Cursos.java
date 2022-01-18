package informacoes;

public class Cursos {
	
	private Integer id;
	private String name;
	private Double valor; 
	
	public Cursos() {
		
	}
	public Cursos(String name,Double valor) {
		this.name=name;
		this.valor=valor;
	}

	public Cursos(Integer id, String name, Double valor) {
		this.id = id;
		this.name = name;
		this.valor = valor;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Curso ID - "+getId()+" : "+getName()+" , Valor : R$"
				+String.format("%.2f", getValor());
	}
}
