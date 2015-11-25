package com.lmax.disruptor;


public class LongEventHandler implements EventHandler<LongEvent> {

    private static int count;


    @Override
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        System.out.println(count++);
    }
}