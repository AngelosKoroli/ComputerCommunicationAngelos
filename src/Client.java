import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Connecting to my server");
        Socket newSocket = new Socket("10.37.148.192", 1000);

        OutputStream out = newSocket.getOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(out);

        objOut.writeObject("#1 Angelos");
        objOut.writeObject("#2 Angelos");
        objOut.writeObject("#3 Angelos");
        System.out.println("sent msg");
    }
}
