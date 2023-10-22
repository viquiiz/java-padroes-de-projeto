package Facade;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

        private CepApi(){
            super();
        }

        public static CepApi getInstancia(){
            return instancia;
        }

    public String getCidade(String cep) {
        return "Araraquara";
    }

    public String getEstado(String cep) {
        return "São Paulo";
    }
}
