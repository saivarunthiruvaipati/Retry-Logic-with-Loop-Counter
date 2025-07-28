def counter = message.getProperty("RetryCount") ?: 0
counter = counter.toInteger() + 1
message.setProperty("RetryCount", counter)
return message
