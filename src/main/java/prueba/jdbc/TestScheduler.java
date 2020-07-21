package prueba.jdbc;

import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
public class TestScheduler {

    @Scheduled(fixedDelay = "1m")
    void run() {
        handle();
    }

    @Transactional
    public void handle() {
        System.out.println("testing.");
    }

}
