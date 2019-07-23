
# Multiple concurrent handlers:

ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler -> App chain
                                            -> EventHandler -> App chain
                                            -> EventHandler -> App chain
                                            -> EventHandler -> App chain

Could thread based on odd even seq numbers? message type? channels

Anything in the packet header basically

Potential issues: -> EventHandler -> App must be thread safe