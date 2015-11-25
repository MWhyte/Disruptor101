
# Multiple concurrent handlers:

ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler -> MDCache
                                            -> EventHandler -> MDCache
                                            -> EventHandler -> MDCache
                                            -> EventHandler -> MDCache

Could thread based on odd even seq numbers? message type?

Something of the packet header

Potential issues: -> EventHandler -> MDCache must be thread safe