package com.stackroute.muzix.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Track {
    @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    @ApiModelProperty(notes = "track id")
    private int trackId;
    @ApiModelProperty(notes="track name")
    private String trackName;
    @ApiModelProperty(notes="track comment")
    private String comments;

}
