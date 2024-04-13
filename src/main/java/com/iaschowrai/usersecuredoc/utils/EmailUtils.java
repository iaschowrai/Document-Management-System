package com.iaschowrai.usersecuredoc.utils;

public class EmailUtils {

    public static String getEmailMessage(String name, String host, String token){
        return "Hello" + name + ",\n\nYour new account has been created. Please click on the link below to verify your account.\n\n"
                + getVerificationUrl(host, token) + "\n\nThe Support Team";
    }

    public static String getResetPasswordMessage(String name, String host, String token){
        return "Hello" + name + ",\n\nTO reset your password. Please click on the link below.\n\n"
                + getResetPasswordUrl(host, token) + "\n\nThe Support Team";
    }

    public static String getVerificationUrl( String host, String token){
        return host + "/verify/account?token=" + token;
    }
    public static String getResetPasswordUrl( String host, String token){
        return host + "/verify/account?token=" + token;
    }

}
