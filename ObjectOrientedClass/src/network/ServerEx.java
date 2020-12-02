package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
    public static void main(String[] args) {
        Thread se = new Thread(new ServerExRunnable());
        se.start();
        try {
            while (true) {
                System.out.println("메인실행중");
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

