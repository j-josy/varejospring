modelo de pacote;
importação java.time.LocalDate;

 classe pública Vendedor {
    int id privado;
    crm de string privado;
    nome de string privado;
    dados privados localDateDeNascimento;
    telefone de string privadoDeContato; 
    endereco endereco privado;

    public Vendedor(int id, String crm, String nome, LocalDate dataDeNascimento) {
        isso. id = id;
        isso. crm = crm;
        isso. nome = nome;
        isso. dataDeNascimento = dataDeNascimento;
    }

    público int getId() {
        devolver isso. id;
    }

    cadeia pública  getCRM() {
        devolver isso. crm;
    }

     String público getNome() {
        devolver isso. nome;
    }

     localdate público obterDataDeNascimento() {
        devolver isso. dataDeNascimento;
    }

    conjunto de vazio públicoDataDeNascimento(Dados LocaisDeNascimento  ) {
        isso. dataDeNascimento = dataDeNascimento;
    }

     String público getTelefoneDeContato() {
        devolver isso. telefoneDeContato;
    }

    vazio público  setTelefoneDeContato(String telefoneDeContato) {
        isso. telefoneDeContato = telefoneDeContato;
    }

    público Endereco getEndereco() {
        devolver isso. endereco;
    }

    conjunto de vazio públicoEndereco(Endereco endereco ) {
        isso. endereco = endereco;
    }

}

