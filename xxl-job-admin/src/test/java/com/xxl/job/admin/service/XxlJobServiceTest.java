package com.xxl.job.admin.service;

import java.util.List;
import java.util.Stack;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxl.job.admin.core.model.XxlJobInfo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class XxlJobServiceTest {

	@Resource
	private XxlJobService xxlJobService;

	@Test
	public void testGetParentXXlJob() {
		Stack<List<XxlJobInfo>> jobs = xxlJobService.getParentXXlJob(2);
		System.out.println(jobs);
	}
}
