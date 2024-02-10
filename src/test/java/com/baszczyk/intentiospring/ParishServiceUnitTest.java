package com.baszczyk.intentiospring;

import com.baszczyk.intentiospring.services.ParishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParishServiceUnitTest {

  @Autowired
  private ParishService bookService;

  @Test
  public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
    //List<Book> books = bookService.list();

    //Assert.assertEquals(books.size(), 3);
  }
}
