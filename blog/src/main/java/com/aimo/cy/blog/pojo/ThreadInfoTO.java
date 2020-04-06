package com.aimo.cy.blog.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ThreadInfoTO {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String status;

}
