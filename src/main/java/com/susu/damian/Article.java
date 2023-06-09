package com.susu.damian;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;


import java.time.LocalDate;

/**
 * @Date:2023/6/9 10:29
 * @Created by Muqing
 */

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("tb_article")
public class Article {

    private Integer id;
    @TableField(value="create_time")
    private LocalDate createTime;

    private String content;


}
