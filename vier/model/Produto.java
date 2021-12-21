modelo de pacote;
classe pública Produto {
   rua de cordas privada;
   soldado String numero;
   bairro de cordas privada;
   cidade de cordas privada;
   estado de string privado;
   cep de string privado;

   público Endereco(String rua, String numero, String bairro, String cidade, String estado) {
       isso. rua = rua;
       isso. numero = numero;
       isso. bairro = bairro;
       isso. cidade = cidade;
       isso. estado = estado;
   }

   público Produto(String rua, String numero, String bairro, String cidade, String estado, String cep) {
       isso. rua = rua;
       isso. numero = numero;
       isso. bairro = bairro;
       isso. cidade = cidade;
       isso. estado = estado;
       isso. cep = cep;
   }

   cadeia pública  getRua() {
       devolver isso. rua;
   }

   vazio público  setRua(String rua) {
       isso. rua = rua;
   }

    String público getNumero() {
       devolver isso. numero;
   }

   conjunto de vazio públicoNumero(  String numero) {
       isso. numero = numero;
   }

    String público getBairro() {
       devolver isso. bairro;
   }

   conjunto vazio públicoBairro(String bairro ) {
       isso. bairro = bairro;
   }

   cadeia pública  getCidade() {
       devolver isso. cidade;
   }

   vazio público  setCidade(String cidade) {
       isso. cidade = cidade;
   }

   cadeia pública  getEstado() {
       devolver isso. estado;
   }

   conjunto de vazio públicoEstado(  String estado) {
       isso. estado = estado;
   }

   público String getCep() {
       devolver isso. cep;
   }

   conjunto de vazio públicoCep(  String cep) {
       isso. cep = cep;
   }

}

