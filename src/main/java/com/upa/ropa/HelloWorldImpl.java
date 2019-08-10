
package com.upa.ropa;

import javax.jws.WebService;

@WebService(endpointInterface = "com.upa.ropa.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello UPA " + text;
    }
}

