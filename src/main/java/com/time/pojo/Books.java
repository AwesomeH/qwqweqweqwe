package com.time.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;  //和数据库中的字段一模一样，尽量都一样
    private String bookName;
    private int bookCounts;
    private String detail;






}

