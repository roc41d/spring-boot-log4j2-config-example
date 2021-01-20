package io.roc41d.log4j2config;

import io.roc41d.log4j2config.service.DemoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

	@Autowired
	DemoService demoService;

	private static Logger LOG = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void runTask() {

		LOG.debug("Debugging log");
		LOG.info("Info log");
		LOG.warn("Hey, This is a warning!");
		LOG.error("Oops! We have an Error. OK");
		LOG.fatal("Damn! Fatal error. Please fix me.");

		demoService.hola();
	}

}
