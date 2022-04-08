package modelos;

public class FuncionarioModelo {
	
	private int codigoFuncionario;
	private String nomeFuncionario;
	private String nascFuncionario;
	private String endFuncionario;
	
	
	public FuncionarioModelo(int codigoFuncionario, String nomeFuncionario, String nascFuncionario,
			String endFuncionario) {
		super();
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.nascFuncionario = nascFuncionario;
		this.endFuncionario = endFuncionario;
	}


	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}


	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getNascFuncionario() {
		return nascFuncionario;
	}


	public void setNascFuncionario(String nascFuncionario) {
		this.nascFuncionario = nascFuncionario;
	}


	public String getEndFuncionario() {
		return endFuncionario;
	}


	public void setEndFuncionario(String endFuncionario) {
		this.endFuncionario = endFuncionario;
	}

}
