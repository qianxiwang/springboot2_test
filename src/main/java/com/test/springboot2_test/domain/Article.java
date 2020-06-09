package com.test.springboot2_test.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class Article {

	private Long id;
	private String author;
	private String title;
	private String content;
	private Date createTime;

	private List<Reader> reader;

}
