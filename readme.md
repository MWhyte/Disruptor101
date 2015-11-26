
# Multiple concurrent handlers:

ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler -> MDCache chain
                                            -> EventHandler -> MDCache chain
                                            -> EventHandler -> MDCache chain
                                            -> EventHandler -> MDCache chain

Could thread based on odd even seq numbers? message type? channels

Anything of the packet header basically

Potential issues: -> EventHandler -> MDCache must be thread safe