package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovaEmpresaForm implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		return "forward:formNovaEmpresa.jsp";
		       
	}
	
}
