package io.roc41d.log4j2config.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {

    private static Logger LOG = LogManager.getLogger(DemoService.class);

    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    public void hola() {

        LOG.info("Info log {}", num);
    }
}
