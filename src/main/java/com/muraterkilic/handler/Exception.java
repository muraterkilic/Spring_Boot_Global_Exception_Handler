package com.muraterkilic.handler;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Exception<E> {

    private String hostName;
    private String path;
    private Date createTime;
    private E message;
}
