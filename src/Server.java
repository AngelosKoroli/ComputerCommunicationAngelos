import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        System.out.println("Creating a socket for communication");
        ServerSocket mySocket = new ServerSocket(1000);
       Socket actualSocket = mySocket.accept();
        System.out.println(" communication started... let's talk");

        Numbers queue = new Numbers();
        DataReader myDataReader = new DataReader(actualSocket, queue);
        ProgramLogicDoer myProgramLogicDoer = new ProgramLogicDoer(queue);

        Thread dataReadThread = new Thread(myDataReader);
        Thread programLogicThread = new Thread(myProgramLogicDoer);

        dataReadThread.start();
        programLogicThread.start();
        }
    }