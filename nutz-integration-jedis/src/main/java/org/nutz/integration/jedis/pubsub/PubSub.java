package org.nutz.integration.jedis.pubsub;

public interface PubSub {

    void onMessage(String channel, String message);
}
