package br.com.adminfo.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FotoStorage {
	
	public String salvarTemporariamente(MultipartFile[] files);
	
	public byte[] recuperarFotoTemporaria(String nome);
	
	public void salvar(String foto);
	
	public byte[] recuperar(String foto);

	public void excluir(String foto);

}