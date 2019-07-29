package com.example.server;

import com.example.server.HelloResponse.Builder;

import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl implements GreetingServceGrpc.GreetinService {

	@Override
	public void greeting(HelloRequest request,StreamObserver<HelloResponse> responseObserver ){
	
		   String name=request.getName();
		HelloResponse response=HelloResponse.newBuilder().setGreeting("Hello"+name);
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
