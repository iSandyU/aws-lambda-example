package com.sandeepmane.awslamdaexample.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambda implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        
        context.getLogger().log("Input is-" + input);

        return "Hello from Lamda- " + input;
    }
    
    
}