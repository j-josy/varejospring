repositório pacote;

importação java.util.HashSet;
importar java.util.Set;
importar java.util.stream.Coletores;

modelo de importação.  Vendedor;

 classe pública MedicoRepository implementa IRepository<Vendedor> {

    conjunto privado< Vendedor> banco = novo HashSet<>();

    @Override
    público boolean cadastrar(Vendedor entidade) {
        banco de retorno . adicionar(entidade);
    }

    @Override
    conjunto público< Vendedor> listar() {
        banco de retorno;
    }

    @Override
    público Vendedor buscar(int id) {
        banco de retorno . fluxo(). filtro(obj -> obj. getId() == id). coleta(Coletores. paraList()). get (0);
    }

    @Override
    público boolean editar(Vendedor entidade) {
        para ( Vendedor vendedor : banco) {
            se (vendedor. getId() == entidade. getId()) {
                medico = entidade;
                retorno verdadeiro;
            }
        }
        retorno falso;
    }

    @Override
    removedor booleano público (int id) {
        banco de retorno . removes(obj -> obj. getId() == id);
    }

}

