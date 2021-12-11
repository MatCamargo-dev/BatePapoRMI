import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDAORMIClient extends Remote {
    void incluir(int id, String nome) throws RemoteException;

    void alterar(int id, String nome) throws RemoteException;

    void excluir(int id) throws RemoteException;

    List<String> consultarPorNome(String dados) throws RemoteException;
}
