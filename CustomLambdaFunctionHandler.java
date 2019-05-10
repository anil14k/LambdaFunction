package com.amazonaws.lambda.demo;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CustomLambdaFunctionHandler implements RequestHandler<CustomRequest, List<CustomResponse>> {

    @Override
    public List<CustomResponse> handleRequest(CustomRequest request, Context context) {
        context.getLogger().log("Input: " + request.getFirstName());
        List<CustomResponse> list = new ArrayList<CustomResponse>();
        if("Anil".equalsIgnoreCase(request.getFirstName())) {
        	list.add(new CustomResponse("Test","IT1","SXM1"));
        	list.add(new CustomResponse("Test1","IT2","SXM2"));
        	list.add(new CustomResponse("Test2","IT3","SXM3"));
        	list.add(new CustomResponse("Test3","IT4","SXM4"));
        }else {
        	list.add(new CustomResponse("Test4","IT5","SXM5"));
        	list.add(new CustomResponse("Test5","IT6","SXM6"));
        	list.add(new CustomResponse("Test6","IT7","SXM7"));
        	list.add(new CustomResponse("Test7","IT8","SXM8"));
        	list.add(new CustomResponse("Test8","IT9","SXM9"));
        }
        return list;
    }

}
