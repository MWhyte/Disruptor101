
# TP and LMAX's example (basic implementation)

ftl -> TPMessageCallback -> ringbuffer -> EventHandler -> MDCache

Problem? the EventHandler will be too slow and max out the ring buffer

Q: How many message's are in these micro bursts.

We've seen up to 30000 backed on on the bus this is MUCH > 1024 (recommended buffer size).
Although we can make it bigger



# Alternative:

ftl -> TPMessageCallback    :per channel
                            -> ringbuffer -> EventHandler -> MDCache
                            -> ringbuffer -> EventHandler -> MDCache
                            -> ringbuffer -> EventHandler -> MDCache
                            -> ringbuffer -> EventHandler -> MDCache

Problem?  micro bursts on one channel will have the same issue as above.
If one channel causes back pressure other ringbuffers / threads wont fill up.

This seems are best hope in conjunction with any optimisations we can find in
EventHandler / MDCache code.



Approach:
1.  Injector (Mark) and Better stats logging (Kurtis)

2.  Implement on disruptor with someone else(?) optimising MDCache code.
    Perf benchmarking via unit tests/ stats logs / jvisualvm.

3.  Measure again

4.  Implement buffer per channel look for even more optimisations

5.  Measure again

6.  Look into disruptor advanced options -> ability to have multiple event handlers per ringBuffer
    consuming doing some work and sending onto next event handler















