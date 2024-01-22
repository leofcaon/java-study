package com.javastudies.javastudiesdemo.env;

public class Environment {
    public static void main(String[] args) {
        System.setProperty("MOCK_AUTHORIZE", "https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc");
        System.setProperty("MOCK_NOTIFICATION", "https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6");
    }
}
