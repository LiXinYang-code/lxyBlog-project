package com.lxy.spring.boot.blog.repository.es;


import com.lxy.spring.boot.domain.es.EsBlog;
import com.lxy.spring.boot.domain.repository.es.EsBlogRepository;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.testng.annotations.Test;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.data.domain.Sort.Direction.ASC;

@RunWith(SpringRunner.class)
 @SpringBootTest
public class EsBlogRepositoryTest {

         @Autowired
         private EsBlogRepository esBlogRepository;
         @Before
         public void initRepositoryData(){
             //delete all data
             esBlogRepository.deleteAll();
             esBlogRepository.save(new EsBlog("love_Story","hello liujunchen",
                     "forever"));
             esBlogRepository.save(new EsBlog("love_Story22","hello liujunchen222",
                     "forever222"));
             esBlogRepository.save(new EsBlog("love_Story33","hello liujunchen3333",
                     "forever333"));
         }

     @org.junit.Test
     @Test

     public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(){
/**
            Pageable pageable = new PageRequest.of(0,20,Sort.by(ASC));

         String title = "li";
            String summary = "junchen";
            String content = "memory";
           Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(
                   title,summary,content,pageable);
            assertThat(page.get()).isEqualTo(3);
            System.out.println("----start1");
            for (EsBlog blog : page.getContent()){

                System.out.println(blog.toString());

            }
            System.out.println("----start2");

 */
     }

}
