import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMensagemServer extends Remote {

    public void setMensagem(String txt) throws RemoteException;

    public String getMensagem() throws RemoteException;
}
