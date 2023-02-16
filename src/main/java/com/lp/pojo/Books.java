package com.lp.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
