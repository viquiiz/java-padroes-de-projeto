package Facade;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().getCidade(cep);
        String estado = CepApi.getInstancia().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
        
    }
}
