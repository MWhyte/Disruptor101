
# Multiple concurrent handlers:

ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler(381) -> MDCache
                                            -> EventHandler(382) -> MDCache
                                            -> EventHandler(383) -> MDCache
                                            -> EventHandler(384) -> MDCache



ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler -> MDCache
                            -> ringbuffer   -> EventHandler -> MDCache
                            -> ringbuffer   -> EventHandler -> MDCache
                            -> ringbuffer   -> EventHandler -> MDCache



Could thread based on odd even seq numbers? message type?

Something of the packet header

Potential issues: -> EventHandler -> MDCache must be thread safe




ftl -> TPMessageCallback (packet header timestamps + ring buffer capacity)   -> ringbuffer   -> EventHandler(381) -> Updaters -> MDCache