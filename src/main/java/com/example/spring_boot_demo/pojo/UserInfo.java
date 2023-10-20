package com.example.spring_boot_demo.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ToString
public class UserInfo implements Serializable {
    private Long userId;
    private String userName ;
    private String userAge;
    private LocalDateTime createTime;
}
