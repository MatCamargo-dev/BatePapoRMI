import java.rmi.RemoteException;

public class MensagemServer implements IMensagemServer {
    private String mensagem;

    protected MensagemServer(String mensagem) throws RemoteException {
        super();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
