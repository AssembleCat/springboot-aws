package com.spring.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDTOTest {

    @Test
    public void lombokTest(){
        //given
        String name = "천신영";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo("천신영");
        Assertions.assertThat(dto.getAmount()).isEqualTo(1000);
    }
}
