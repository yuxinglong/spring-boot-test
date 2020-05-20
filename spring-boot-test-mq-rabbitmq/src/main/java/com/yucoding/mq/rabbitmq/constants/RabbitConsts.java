package com.yucoding.mq.rabbitmq.constants;

public interface RabbitConsts {

    String DIRECT_MODE_QUEUE_ONE = "queue.direct.1";

    String QUEUE_TWO = "queue.2";

    String QUEUE_THREE = "3.queue";

    String FANOUT_MODE_QUEUE = "fanout.mode";

    String TOPIC_MODE_QUEUE = "topic.mode";

    String TOPIC_ROUTING_KEY_ONE = "queue.#";

    String TOPIC_ROUTING_KEY_TWO = "*.queue";

    String TOPIC_ROUTING_KEY_THREE = "3.queue";

    String DELAY_QUEUE = "delay.queue";

    String DELAY_MODE_QUEUE = "delay.mode";
}
