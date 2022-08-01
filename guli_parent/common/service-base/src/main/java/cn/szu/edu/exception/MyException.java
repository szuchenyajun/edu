package cn.szu.edu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Author yajun
 * @Date 2022/8/2
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class MyException extends RuntimeException{

    private Integer code;
    private String msg;
}
