package com.test.springboot2_test.queue;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class ConsumerRedisListener implements MessageListener {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	@Override
	public void onMessage(Message message, byte[] pattern) {
		doBusiness(message);
	}

	/**
	 * 打印 message body 内容
	 *
	 * @param message
	 */
	public void doBusiness(Message message) {
		Object value = redisTemplate.getValueSerializer().deserialize(message.getBody());
		System.out.println("consumer message: " + value.toString());
	}

}
