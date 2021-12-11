import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    static IDAORMIClient mensagem;

    public void conectar() throws NotBoundException, MalformedURLException, RemoteException {

        System.setProperty("java.security.policy", "file:./politicas.policy");
        //  if (System.getSecurityManager() == null)
        //      System.setSecurityManager(new RMISecurityManager());


        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5003);
        mensagem = (IDAORMIClient) registry.lookup("MensagemService");

        //lista os servicos
        String[] servicos = registry.list();
        for (int i = 0; i < servicos.length; i++) {
            System.out.println(servicos[i]);
        }

    }

    public IDAORMIClient getMensagemBuffer() {
        return mensagem;
    }
}
