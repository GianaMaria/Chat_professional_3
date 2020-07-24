package client;

import java.io.*;

public class LocalHistory {

    public static void addFile(String login) throws IOException {
        File file = new File("client/src/main/java/history/history_" + login + ".txt");
        file.createNewFile();
    }

    public static void addMsgHistory(String login, String msg) throws IOException {
        FileOutputStream fos = new FileOutputStream("client/src/main/java/history/history_" + login + ".txt"    , true);
        msg = msg + "\n";
        fos.write(msg.getBytes());
        fos.close();
    }


}
