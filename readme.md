
# Multiple concurrent handlers:

ftl -> TPMessageCallback    -> ringbuffer   -> EventHandler -> App
                                            -> EventHandler -> App
                                            -> EventHandler -> App
                                            -> EventHandler -> App

Could thread based on odd even seq numbers? message type?

Something of the packet header

Potential issues: -> EventHandler -> App must be thread safe