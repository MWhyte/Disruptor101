
#### TP and LMAX's example (basic implementation)

ftl -> TPMessageCallback -> ringbuffer -> EventHandler -> Rest of app

Problem? the EventHandler will be too slow and max out the ring buffer

Q: How many message's are in these micro bursts.

We've seen up to 30000 backed up on the bus which is much greater than the recommended buffer size(1024).
Although we can make it bigger



#### Alternative:

ftl -> TPMessageCallback ->

:per channel
- ringbuffer -> EventHandler -> MDCache
- ringbuffer -> EventHandler -> MDCache
- ringbuffer -> EventHandler -> MDCache
- ringbuffer -> EventHandler -> MDCache

Problem?  micro bursts on one channel will have the same issue as above.
If one channel causes back pressure other ring buffers / threads wont fill up.

This seems are best hope in conjunction with any optimisations we can find in
EventHandler / Rest of the app.



Approach:
1. Test Injector and Better stats logging
2. Perf benchmarking via unit tests / jmh / stats logs / jvisualvm.
3. Implement buffer per channel look for even more optimisations
4. Measure again
5. Look into disruptor advanced options -> ability to have multiple event handlers per ringBuffer
   consuming & doing some work and sending onto next event handler















