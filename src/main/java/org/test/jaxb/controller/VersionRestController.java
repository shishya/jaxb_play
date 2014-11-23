package org.test.jaxb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.test.jaxb.model.Version;

@RestController
public class VersionRestController
{
    @RequestMapping("/version")
    public @ResponseBody Version getVersion()
    {
        Version version = new Version();
        version.setMajorVersion("1");
        version.setMinorVersion("0");
        version.setPatchVersion("0");
        return version;
    }
}
