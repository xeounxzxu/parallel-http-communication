package io.xeounxzxu.client1.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("hello")
class HelloController {

    @GetMapping("/v1")
    fun getHelloV1(
        @RequestParam(required = false) sleepDuration: Long?,
        @RequestParam(defaultValue = "false") isError: Boolean,
    ): String {

        // Sleep Time
        sleepDuration?.let { Thread.sleep(it) }

        // check exception
        if (isError) throw RuntimeException("check exception")

        // return request
        return "Hello V1"
    }


    @GetMapping("/v2")
    fun getHelloV2(
        @RequestParam(required = false) sleepDuration: Long?,
        @RequestParam(defaultValue = "false") isError: Boolean,
    ): String {

        // Sleep Time
        sleepDuration?.let { Thread.sleep(it) }

        // check exception
        if (isError) throw RuntimeException("check exception")

        // return request
        return "Hello V2"
    }
}
