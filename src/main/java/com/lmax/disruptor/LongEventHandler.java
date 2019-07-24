package com.lmax.disruptor;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LongEventHandler implements EventHandler<LongEvent> {

    private static final Logger LOG = LogManager.getLogger(LongEventHandler.class);
    private static int count;

    @Override
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        LOG.info(count++);
    }
}