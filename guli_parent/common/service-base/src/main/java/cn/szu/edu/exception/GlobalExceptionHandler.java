package cn.szu.edu.exception;

import cn.szu.edu.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author yajun
 * @Date 2022/8/2
 * @Version 1.0
 */
@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public R error(Exception e){
        log.info(e.getMessage());
        return R.error().message("发生异常");
    }
    //优先执行特定异常
    @ExceptionHandler(ArithmeticException.class)
    public R error1(Exception e){
        log.info(e.getMessage());
        return R.error().message("发生算术异常");
    }
    //自定义异常
    @ExceptionHandler(MyException.class)
    public R error2(MyException e){
        log.info(e.getMessage());
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}
