package jpa2.service;

import jakarta.persistence.EntityManager;
import jpa2.domain.item.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    @DisplayName("updateTest")
    public void updateTest() throws Exception {
        // given
        Book book = em.find(Book.class, 1L);
        // when
        book.setName("test");
        // 변경감지 == dirty checking

        // then

    }
}
