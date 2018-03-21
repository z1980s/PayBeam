package info.paybeam.www.paybeam.ConnectionModule;


import android.os.AsyncTask;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConnectionModule extends AsyncTask<Void, Void, Void> {


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            System.out.println("Client Started");
            //create socket to server
            Socket clientSocket = new Socket("182.55.236.211", 3333);

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
            reply = (Message) ois.readObject();

            if (reply.getHeader().equals("Reply")) {
                System.out.println("Got '" + reply.getData() + "'");
            }


            ois.close();
            oos.close();
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();}
        return null;
    }

}
