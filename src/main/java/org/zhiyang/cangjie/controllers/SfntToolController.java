package org.zhiyang.cangjie.controllers;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/sfntTool")
public class SfntToolController {

    @RequestMapping(value = "/subsetFontFile/{fontId}_{subsetString}.{outFormat}")
    public String subsetFontFile(
            HttpServletResponse servletResponse,
            @PathVariable String fontId,
            @PathVariable String outFormat,
            @PathVariable String subsetString) {
        return String.format("fontId:%s,outFormat:%s,subsetString:%s", fontId, outFormat, subsetString);
    }

}
