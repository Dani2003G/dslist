package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDTO {

    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private BigDecimal score;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
