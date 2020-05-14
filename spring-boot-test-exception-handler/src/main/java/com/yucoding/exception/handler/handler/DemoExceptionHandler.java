package com.yucoding.exception.handler.handler;

import com.yucoding.exception.handler.exception.JsonException;
import com.yucoding.exception.handler.exception.PageException;
import com.yucoding.exception.handler.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Slf4j
public class DemoExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value=JsonException.class)
    @ResponseBody
    public ApiResponse jsonErrorHandler(JsonException jsonException){
        log.error("json error");
        return ApiResponse.ofException(jsonException);

    }

    public ModelAndView pageErrorHandle(PageException pageException){
        log.error("page error");
        ModelAndView view =new ModelAndView();
        view.addObject("message",pageException.getMessage());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;


    }
}
