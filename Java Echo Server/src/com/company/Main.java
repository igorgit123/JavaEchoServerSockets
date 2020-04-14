package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {

           ServerSocket mSocket = new ServerSocket(4880);



            Socket client = mSocket.accept();

            boolean whiile= true;

            while (whiile) {


                BufferedReader input= new BufferedReader(new InputStreamReader(client.getInputStream()));
                String msg=input.readLine();
                if(msg!=null){
                    whiile =false;
                }
                System.out.println("message from client: " + msg);


                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                out.println("sending back echo: "+ msg);


                    }


        } catch (IOException _e){
            _e.printStackTrace();}


    }

}
