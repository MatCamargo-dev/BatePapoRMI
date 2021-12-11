import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ClientRMI {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

        RMIClient client = new RMIClient();

        client.conectar();

        client.getMensagemBuffer().incluir(0, "Joao");
        client.getMensagemBuffer().incluir(1, "Jose");

        client.getMensagemBuffer().alterar(0, "Joaquim");

        client.getMensagemBuffer().excluir(1);

        List<String> list = client.getMensagemBuffer().consultarPorNome("Joaquim");

        for (String line : list) {
            System.out.println(line);
        }
    }
}
