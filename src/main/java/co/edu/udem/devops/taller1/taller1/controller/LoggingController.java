package co.edu.udem.devops.taller1.taller1.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Logging")
@Configuration 
public class LoggingController {

    Logger logger = LogManager.getLogger(LoggingController.class);

    @GetMapping(path = "/info")
    public String info() {
        logger.info("Un evento de info");
        return "Un evento de info";
    }

    @GetMapping(path = "/warn")
    public String warn() {
        logger.warn("Un evento de warn");
        return "Un evento de warn";
    }

    @GetMapping(path = "/debug")
    public String debug() {
        logger.debug("Un evento de debug");
        return "Un evento de debug";
    }

    @GetMapping(path = "/error")
    public String error() {
        logger.error("Un evento de error");
        return "Un evento de error";
    }

}
