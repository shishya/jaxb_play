package org.test.jaxb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.test.jaxb.model.Version;

import javax.annotation.Resource;

@RestController
public class VersionRestController
{

    @Resource
    private RequestMappingHandlerAdapter adapter;

    @RequestMapping("/version")
    public @ResponseBody Version getVersion()
    {
        System.out.println(adapter.getClass());
        for(HttpMessageConverter<?> converter : adapter.getMessageConverters())
        {
            System.out.println(converter.getClass());
            if ( converter instanceof Jaxb2RootElementHttpMessageConverter )
            {
                Jaxb2RootElementHttpMessageConverter jaxbConverter =
                        (Jaxb2RootElementHttpMessageConverter) converter;
            }
        }
        Version version = new Version();
        version.setMajorVersion("1");
        version.setMinorVersion("0");
        version.setPatchVersion("0");
        return version;
    }
}
