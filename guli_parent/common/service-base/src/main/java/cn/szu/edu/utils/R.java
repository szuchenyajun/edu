package cn.szu.edu.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yajun
 * @Date 2022/8/2
 * @Version 1.0
 */
@Data
public class R {
    private Boolean success;
    private Integer code;
    private String message;
    private Map<String,Object> data = new HashMap<>();

    private R(){}
    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public R message(String message){
        setMessage(message);
        return this;
    }
    public R code(Integer code){
        setCode(code);
        return this;
    }
    public R data(Map<String,Object> data){
        setData(data);
        return this;
    }
    public R data(String key,Object value){
        data.put(key,value);
        return this;
    }
}
