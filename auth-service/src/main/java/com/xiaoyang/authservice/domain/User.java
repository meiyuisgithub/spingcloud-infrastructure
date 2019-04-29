package com.xiaoyang.authservice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author WXY
 * @date 2018/8/3 18:54
 */
@Setter
@Getter
@ToString
public class User implements Serializable {

    private Integer id;
    private String name;
    private String psw;
    private String emil;
    private String mobile;
    private String createTime;

}
