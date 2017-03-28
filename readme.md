
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















