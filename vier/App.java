package view;
vista do pacote;

importação java.time.LocalDate;

controlador de importação.  VendedorController;
modelo de importação. Vendedor;

Aplicativo de classe pública {
    principal vazio  estático público(String[] args) {
        VendedorController vendedorController = novo VendedorController();

        var vendedores = VendedorController. listar();

        Sistema. para fora. printf("Atualmente temos %d vendedores cadastrados\n",vendedores. tamanho());

        var vendedor = novo Vendedor(1  , "222222-RS",  "Reinaldo Amaral", LocalDate. de:(1971, 8, 24));

 vendedorController. cadastrar(vendedor);

 vendedores = medicoController. listar();

        Sistema. para fora. printf("Atualmente temos %d vendedores cadastrados\n",vendedores. tamanho());

 vendedorController. removedor(1);

 vendedores = vendedorController. listar();

        Sistema. para fora. printf("Atualmente temos %d vendedores cadastrados\n",vendedores. tamanho());
    }
}