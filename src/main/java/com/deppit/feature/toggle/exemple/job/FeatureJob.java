package com.deppit.feature.toggle.exemple.job;

import com.deppit.feature.toggle.annotation.FeatureToggle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FeatureJob {

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        feature1();
        feature2();
    }

    @FeatureToggle(name = "feature 1")
    private void feature1() {
        log.info("FEATURE 1: Fixed delay task - {}", System.currentTimeMillis() / 1000);
    }

    @FeatureToggle(name = "feature 2")
    private void feature2() {
        log.info("FEATURE 2: Fixed delay task - {}", System.currentTimeMillis() / 1000);
    }
}
