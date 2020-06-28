package com.test.springboot2_test.queue;

import java.io.Serializable;

public class MessageEntity implements Serializable {
	private static final long serialVersionUID = 8632296967087444509L;

	private String id;

	private String content;

	public MessageEntity() {
		super();
	}

	public MessageEntity(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MessageEntity [id=" + id + ", content=" + content + "]";
	}

}
