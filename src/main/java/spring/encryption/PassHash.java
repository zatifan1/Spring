package spring.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassHash {
    public static String toHash(String s) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(s.getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bytes){
            stringBuilder.append(String.format("%02X ", b));
        }
        return stringBuilder.toString();
    }
}
