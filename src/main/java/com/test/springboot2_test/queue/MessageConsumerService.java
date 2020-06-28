package com.test.springboot2_test.queue;

/**
 * 消息的消费者，消费者需要不断的去轮询队列，有消息就取出来
 */
//@Service
//public class MessageConsumerService extends Thread {

//	@Resource
//	private RedisTemplate<String, MessageEntity> redisTemplate;
//
//	private volatile boolean flag = true;
//
//	@Value("${redis.queue.key}")
//	private String queueKey;
//
//	@Value("${redis.queue.pop.timeout}")
//	private Long popTimeout;
//
//	@Override
//	public void run() {
//		try {
//			MessageEntity message;
//			while (flag && !Thread.currentThread().isInterrupted()) {
//				message = redisTemplate.opsForList().rightPop(queueKey, popTimeout, TimeUnit.SECONDS);
//				System.out.println("接收到了" + message);
//			}
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//	}
//
//	public boolean isFlag() {
//		return flag;
//	}
//
//	public void setFlag(boolean flag) {
//		this.flag = flag;
//	}

//}
