package controller;

import java.util.Set;
import model.Vendedor;
import repository.VendedorRepository;

public class VendedorController implements IController<VendedorController> {
    private VendedorRepository vendedorRepository = new VendedorRepository();

    @Override
    public boolean cadastrar(Vendedor entidade) {
        if (entidade != null)
            return vendedorRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public Set<Vendedor> listar() {
        return vendedorRepository.listar();
    }

    @Override
    public Vendedor buscar(int id) {
        if (id < 0)
            return null;
        return vendedorRepository.buscar(id);
    }

    @Override
    public boolean editar(Vendedor entidade) {
        if (entidade != null)
            return vendedorRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        if (id < 0)
            return false;
        return vendedorRepository.remover(id);
    }

}

