package info.paybeam.www.paybeam.ConnectionModule;


import java.net.*;
import java.io.*;

public class ConnectionModule {

    public void start()
    {
        try {
            System.out.println("Client Started");
            //create socket to server
            Socket clientSocket = new Socket( "182.55.236.211" , 3333);

            //119.56.106.139
            //10.33.88.155

            //get input and output stream
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());

            //craft a new Message
            Message msg = new Message("CreateAccount");
            msg.setData("Hello world!");

            //send Message
            oos.writeObject(msg);

            //wait for reply
            Message reply = null;
            reply = (Message)ois.readObject();

            if (reply.getHeader().equals("Reply")) {
                System.out.println("Got '" + reply.getData() + "'");
            }


            ois.close();
            oos.close();
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

}
