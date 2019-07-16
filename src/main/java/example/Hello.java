package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<HelloRequest, HelloResponse> {

    public HelloResponse handleRequest(HelloRequest input, Context context) {
        return new HelloResponse(input.getInput());
    }

}