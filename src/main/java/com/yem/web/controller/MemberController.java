package com.yem.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月23日 上午9:59:08 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class MemberController {

    @GetMapping("hello")
    @PreAuthorize("hasAnyAuthority('hello')")
    public String hello(){
        return "hello";
    }

    @GetMapping("current")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("query")
    @PreAuthorize("hasAnyAuthority('query')")
    public String query() {
        return "具有query权限";
    }
}
