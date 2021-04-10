package com.example.demo;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private static final Logger logger = LogManager.getLogger(a.class);

    public void fu(){
        logger.info("hello");
    }
}
