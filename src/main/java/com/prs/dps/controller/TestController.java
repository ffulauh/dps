package com.prs.dps.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class TestController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String getLicenses(@PathVariable("organizationId") String organizationId) {
        return "233";
    }

    @RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
    public String getLicenses( @PathVariable("organizationId") String organizationId,
                                @PathVariable("licenseId") String licenseId) {
        return "233";
    }


}
