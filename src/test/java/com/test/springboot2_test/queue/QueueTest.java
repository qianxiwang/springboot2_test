package com.test.springboot2_test.queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueueTest {

//	@Autowired
//	private MessageProducerService producer;

//	@Autowired
//	private MessageConsumerService consumer;

	/**
	 * 消息队列模型测试
	 */
//	@Test
//	public void testQueue() {
//		consumer.start();
//		producer.sendMeassage(new MessageEntity("1", "aaaa"));
//		producer.sendMeassage(new MessageEntity("2", "bbbb"));
//
//		try {
//			Thread.sleep(2000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		consumer.interrupt();
//	}


	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	/**
	 * 发布订阅模型测试
	 */
	@Test
	public void testSubscribe() {
		String channel = "topic";

		System.out.println("开始发送消息。。。。。。。。。。。。。。");
		redisTemplate.convertAndSend(channel, "hello world");
		redisTemplate.convertAndSend(channel, new Date(System.currentTimeMillis()));
		redisTemplate.convertAndSend(channel, new MessageEntity("1", "object"));
		System.out.println("发送消息结束。。。。。。。。。。。。。。");

	}

}
