package com.mxt.mxt;

import com.mxt.mxt.util.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MxtApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private Task task;

	@Test
	public void test() throws Exception {
		task.doTask1();
		task.doTask2();
		task.doTask3();
	}

//	@Test
//	public void test(){
//		stringRedisTemplate.opsForValue().set("aaa", "111");
//		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
//	}

//	@Test
//	public void contextLoads() {
//	}

}
