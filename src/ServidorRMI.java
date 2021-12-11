import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ServidorRMI {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, InterruptedException, IOException {
        MensagemServer msg = new MensagemServer("");
        MensagemServerRMI sv = new MensagemServerRMI(msg);
        Scanner mensagem = new Scanner(System.in);
        String mensagem1 = "";


        try {
            while (true) {
                System.out.println("Mensagem: ");
                mensagem1 = mensagem.nextLine();

                sv.msgBuffer.setMensagem(mensagem1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
