package org.example.project2.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHashing {

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }


    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
