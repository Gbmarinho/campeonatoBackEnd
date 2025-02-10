package com.demo.campeonato.responseDto;

public class testeResponseDto {
	private String mensagem;

	public testeResponseDto(String mensagem) {
        this.mensagem = mensagem;
    } 
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}