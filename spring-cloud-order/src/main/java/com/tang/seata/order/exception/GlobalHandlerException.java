package com.tang.seata.order.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname GlobalHandlerException
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2020/10/2 19:27
 * @Created by ASUS
 */
@ControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> exceptionHandler() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 500);
        resultMap.put("message", "error...");
        return resultMap;
    }

}