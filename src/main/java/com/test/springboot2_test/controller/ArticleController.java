package com.test.springboot2_test.controller;

import com.test.springboot2_test.domain.AjaxResponse;
import com.test.springboot2_test.domain.Article;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@Api(description = "文章接口")
public class ArticleController {

	@GetMapping("/articles/{id}")
	@ApiOperation(value = "获取文章", notes = "根据id查询一篇文章")
	public AjaxResponse getArticle(@PathVariable("id") Long id) {

		//使用lombok提供的builder构建对象
		Article article = Article.builder()
				.id(id)
				.author("zimug")
				.content("spring boot从青铜到王者")
				.createTime(new Date())
				.title("t1").build();

		log.info("article:" + article);

		return AjaxResponse.success(article);
	}

	@PostMapping("/articles")
	@ApiOperation(value = "增加文章", notes = "增加一篇文章")
	public AjaxResponse saveArticle(@RequestBody Article article) {
		//因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
		log.info("saveArticle:" + article);

		return AjaxResponse.success();
	}

	@PutMapping("/articles")
	@ApiOperation(value = "更新文章", notes = "根据id更新一篇文章")
	public AjaxResponse updateArticle(@RequestBody Article article) {
		if (article.getId() == null) {
			//article.id是必传参数，因为通常根据id去修改数据
			//TODO 抛出一个自定义的异常
		}

		log.info("updateArticle:" + article);
		return AjaxResponse.success();
	}

	@DeleteMapping("/articles/{id}")
	@ApiOperation(value = "删除文章", notes = "根据id删除一篇文章")
	public AjaxResponse deleteArticle(@PathVariable("id") Long id) {

		log.info("deleteArticle:" + id);
		return AjaxResponse.success();
	}




}
