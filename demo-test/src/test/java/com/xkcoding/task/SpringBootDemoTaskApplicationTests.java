package com.xkcoding.task;

import com.xkcoding.task.job.TaskJob;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoTaskApplicationTests {

  @Resource
   private TaskJob taskJob;

    @Test
    public void contextLoads() {
      taskJob.job3();
    }

}
