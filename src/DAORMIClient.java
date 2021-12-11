import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class DAORMIClient implements IDAORMIClient {

    private static final long serialVersionUID = 1L;

    List<Client> clientes = new ArrayList<>();


    protected DAORMIClient(String mensagem) throws RemoteException {
        super();
    }

    @Override
    public void incluir(int id, String nome) throws RemoteException {
        clientes.add(new Client(id, nome));
    }

    @Override
    public void alterar(int id, String nome) throws RemoteException {
        Client clienteAlterar = null;
        for (Client cliente : clientes) {
            if (cliente.getId() == id) {
                clienteAlterar = cliente;
            }
        }
        clienteAlterar.setNome(nome);
    }

    @Override
    public void excluir(int id) throws RemoteException {
        Client clienteExcluir = null;
        for (Client cliente : clientes) {
            if (cliente.getId() == id) {
                clienteExcluir = cliente;
            }
        }
        clientes.remove(clienteExcluir);
    }

    @Override
    public List<String> consultarPorNome(String dados) throws RemoteException {
        List<String> clientesListaString = new ArrayList<>();
        for (Client cliente : clientes) {
            if (dados.equals(cliente.getNome()))
                clientesListaString.add("{id:" + cliente.getId() + "; nome:" + cliente.getNome() + ";}");
        }
        return clientesListaString;
    }
}
