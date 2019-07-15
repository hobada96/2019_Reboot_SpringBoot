package com.ksu.kth.domain;

import com.ksu.kth.repository.BasicRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class basicTest {
    @Autowired
    BasicRepository basicRepository;
    Basic saveBasic;

    @Before
    public void init(){
        Basic basic = Basic.builder()
                .name("kth")
                .label("label?")
                .email("email?")
                .phone("phone??")
                .build();
        saveBasic = basicRepository.save(basic);
    }
    @Test
    public void testVoid(){
        Basic findBasic = basicRepository.findById(saveBasic.getIdx()).orElse(null);
        assertThat(findBasic.getIdx()).isEqualTo(saveBasic.getIdx());
    }
}
