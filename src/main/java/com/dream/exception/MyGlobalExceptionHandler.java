package com.dream.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: huzejun
 * @Date: 2024/11/1 22:17
 */

@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex) {
        ex.printStackTrace();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        return mv;
    }
}
