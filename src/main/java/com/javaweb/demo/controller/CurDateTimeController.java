package com.javaweb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/date")
public class CurDateTimeController {
    //获取当前时间的接口/date/getdate
    @RequestMapping(value = "/getdate",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDate(HttpServletResponse response)
    {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyy-MM-dd");
        String datetime = tempDate.format(new java.util.Date());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",datetime);
        return map;
    }

    //获取当前时间的接口/date/gettime
    @RequestMapping(value = "/gettime",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getTime(HttpServletResponse response)
    {
        SimpleDateFormat tempDate = new SimpleDateFormat("HH:mm:ss");
        String datetime = tempDate.format(new java.util.Date());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",datetime);
        return map;
    }

    //实现获取当前日期时间的接口
    @RequestMapping(value = "/getdatetime",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDateTime(HttpServletResponse response)
    {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String datetime = tempDate.format(new java.util.Date());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",datetime);
        return map;
    }
}
