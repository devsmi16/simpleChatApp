import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws  Exception {
        Socket socket = new Socket("localhost", 1071);
        System.out.println("Connected to server");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));

        String inputLine;
        while ((inputLine = consoleIn.readLine()) != null){
            out.println(inputLine);

            String responseLine = in.readLine();
            System.out.println("Server: "+ responseLine);
        }
    }
}