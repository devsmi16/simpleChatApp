import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1071);
        System.out.println("server is starting 8000 port");

        Socket socket = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println("Client: "+ inputLine);
            String responseLine = consoleIn.readLine();
            out.println(responseLine);
        }
    }
}