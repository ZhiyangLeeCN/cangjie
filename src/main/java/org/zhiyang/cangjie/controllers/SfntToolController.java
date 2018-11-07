package org.zhiyang.cangjie.controllers;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/sfntTool")
public class SfntToolController {

    @RequestMapping(value = "/subsetFontFile/{fontFile}/{subsetString}.{outFormat}")
    public String subsetFontFile(
            HttpServletResponse servletResponse,
            @PathVariable String fontFile,
            @PathVariable String outFormat,
            @PathVariable String subsetString) {
        return String.format("fontFile:%s,outFormat:%s,subsetString:%s", fontFile, outFormat, subsetString);
    }

}
